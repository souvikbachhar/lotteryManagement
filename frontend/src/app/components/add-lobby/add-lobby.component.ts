import { Component, OnInit } from '@angular/core';
import { LotteryServiceService } from 'src/app/service/lottery-service.service';

@Component({
  selector: 'app-add-lobby',
  templateUrl: './add-lobby.component.html',
  styleUrls: ['./add-lobby.component.css']
})
export class AddLobbyComponent implements OnInit {
  newLobby:boolean=true;
  lobbyName='';
  entryFee;
  memberCount;
  constructor(private lobbyService:LotteryServiceService) { }

  ngOnInit() {
   
  }

  addLobby(){
    let request={
      "lobbyName":this.lobbyName,
      "memberCount":this.memberCount,
      "entryPrice":this.entryFee
    }
    this.lobbyService.addLobby(request).subscribe(response=>{
      console.log(response);
      this.newLobby=false;
    })
    //this.newLobby=false;
  }
}
