import { Component, OnInit } from '@angular/core';
import { HttpPhotoService } from '../http-photo.service';

@Component({
  selector: 'app-post-photo-grid',
  templateUrl: './post-photo-grid.component.html',
  styleUrls: ['./post-photo-grid.component.css']
})
export class PostPhotoGridComponent implements OnInit {

  public posts: any[] = [];

  constructor(private httpService : HttpPhotoService) {
    this.httpService.getPosts().subscribe(data => this.posts = data)
   }

  ngOnInit(): void {
  }

}
