import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
import { User } from '../../users/User';
const URL = {
  USERS: '/users'
}
@Injectable({
  providedIn: 'root'
})
export class UsersService {
   httpOptions = {
    headers: new HttpHeaders({
      'Access-Control-Allow-Origin': '*',
      'Authorization': 'authkey',
      'userid': '1'
    })
  };
  constructor(private http: HttpClient) { }
  getUsers(): Observable<User[]> {
    var users = this.http.get<User[]>(environment.apiUrl + URL.USERS, this.httpOptions)
    return users
  }
}
