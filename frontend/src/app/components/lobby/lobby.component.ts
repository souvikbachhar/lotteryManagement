import { Component, OnInit } from '@angular/core';
import { LotteryServiceService } from 'src/app/service/lottery-service.service';
@Component({
  selector: 'app-lobby',
  templateUrl: './lobby.component.html',
  styleUrls: ['./lobby.component.css']
})
export class LobbyComponent implements OnInit {
  lobby;
  memberName;
  winner;
  constructor(private lobbyService:LotteryServiceService) { }

  ngOnInit() {
    this.lobby=this.lobbyService.getSelectedLobby();
    if(this.lobby.winnerId!=null){
      let request={
        "memberId":this.lobby.winnerId
      }
      this.lobbyService.getMember(request).subscribe(res=>{
          this.winner=res.body.member.memberName;
      });
    }
  }

  addMember(){
    let request={
      "memberName":this.memberName,
      "lobbyId":this.lobby.lobbyId
    }
    this.lobbyService.addMember(request).subscribe(res=>{
      this.memberName="";
      this.lobby.memberRegistered=res.body.memberRegistered;
      alert("member added");
      console.log(res);
    })
    
  }

  startLottery(){
    let request={
      "lotteryId":this.lobby.lobbyId
    }
    this.lobbyService.startLottery(request).subscribe(res=>{
        console.log(res);
        this.winner=res.body.winnerName;
        this.lobby.winnerId=res.body.winnerId;
    });
  }
}
