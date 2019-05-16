import { Component, OnInit } from '@angular/core';
import { UsersService } from '../services/users/users.service';
import { User } from './User';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.sass']
})
export class UsersComponent implements OnInit {

  users: User[]
  constructor(private usersService: UsersService) { }

  ngOnInit() {
    this.usersService.getUsers().subscribe(data => {
      this.users = data
      console.log(this.users) 
    })
  }

}
