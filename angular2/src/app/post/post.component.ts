import { Component, OnInit } from '@angular/core';
import {HttpService} from 'src/app/http.service'

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  public posts: any[] =[];

  constructor(private httpService: HttpService) {
    this.httpService.getPosts().subscribe(data => this.posts = data)
   }

  ngOnInit(): void {
  }

}
