import {Component, Injectable, OnInit} from '@angular/core';
import {pipe, Subject} from "rxjs";
import {tap} from "rxjs/operators";

@Component({
  selector: 'app-cata',
  templateUrl: './cata.component.html',
  styleUrls: ['./cata.component.css']
})
@Injectable({
  providedIn: 'root'
})
export class CataComponent implements OnInit {
public m=0;
  constructor() { }

  ngOnInit(): void {
  }
a()
{
   this.m+=1;
 pipe(
     tap(() => {
       this._ref.next();
     }));
}
  private _ref = new Subject<void>();
  get ref() {
    return this._ref;
  }
}
