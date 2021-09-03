import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/authservice.service';
import { User } from 'src/app/user.model';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  message = '';
  userModel = new User('Mark', 'm@gmail.com', '9999', '123456', 'USA', 'male', true)
  countries = ['USA', 'UK', 'Japan']

  constructor(private authService: AuthService) { }

  ngOnInit(): void {
  }

  onFormSubmit(){
    this.authService.register(this.userModel).subscribe(response  => {
      console.log(response)
      this.message = response.message;
    })
    
  }

}
