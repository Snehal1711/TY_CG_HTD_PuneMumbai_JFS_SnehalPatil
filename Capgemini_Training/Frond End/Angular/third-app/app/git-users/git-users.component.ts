import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-git-users',
  templateUrl: './git-users.component.html',
  styleUrls: ['./git-users.component.css']
})
export class GitUsersComponent implements OnInit {

  gitusers=[];


  constructor(http : HttpClient) {
    http.get<any>('https://api.github.com/users').subscribe(data => {
      this.gitusers =data;
      console.log(this.gitusers)
    },err =>{
      console.log(err);
        });
   }

  ngOnInit() {
  }

}
