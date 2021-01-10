import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddLobbyComponent } from './components/add-lobby/add-lobby.component';
import { LandingComponent } from './components/landing/landing.component';
import { LobbyComponent } from './components/lobby/lobby.component';


const routes: Routes = [
  {path: '',component:LandingComponent},
  {path:'addLobby',component:AddLobbyComponent},
  {path:'lobby',component:LobbyComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
