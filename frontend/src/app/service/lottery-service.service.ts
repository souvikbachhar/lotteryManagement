import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
const apiUrl=environment.apiUrl
@Injectable({
  providedIn: 'root'
})
export class LotteryServiceService {

  private selectedLobby;
  public setSelectedLobby(request){
    this.selectedLobby=request;
  }
  public getSelectedLobby(){
    return this.selectedLobby;    
  }

  constructor(private http: HttpClient) { }

  getLobby(): Observable<HttpResponse<any>> {
    return this.http.get(apiUrl + '/get-lobby', { observe: 'response' });
  }

  addLobby(request): Observable<HttpResponse<any>> {
    return this.http.post(apiUrl + '/add-lobby',  request,{ observe: 'response' });
  }

  addMember(request): Observable<HttpResponse<any>> {
    return this.http.post(apiUrl + '/add-member',  request,{ observe: 'response' });
  }

  startLottery(request): Observable<HttpResponse<any>> {
    return this.http.post(apiUrl + '/start-lottery',  request,{ observe: 'response' });
  }

  getMember(request): Observable<HttpResponse<any>> {
    return this.http.post(apiUrl + '/get-member',  request,{ observe: 'response' });
  }
}
