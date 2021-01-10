import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LotteryServiceService } from 'src/app/service/lottery-service.service';

@Component({
  selector: 'app-landing',
  templateUrl: './landing.component.html',
  styleUrls: ['./landing.component.css']
})
export class LandingComponent implements OnInit {
  lobbies;
  constructor(private lotteryService:LotteryServiceService,private router:Router) { }

  ngOnInit() {
    this.lotteryService.getLobby().subscribe(res=>{
      console.log(res.body.lobbyList);
      this.lobbies=res.body.lobbyList;
    })
  }

  openLobby(lobby){
    this.lotteryService.setSelectedLobby(lobby);
    this.router.navigate(['lobby']);
  }

}
