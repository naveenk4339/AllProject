import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HelloWorldComponent } from './hello-world/hello-world.component';
import { DateComponent } from './date/date.component';
import { ViewModule } from './view/view.module';
import { TestService } from './test.service';
import { HttpClientModule} from  '@angular/common/http';
import { Route ,RouterModule} from  '@angular/router';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { ContactComponent } from './contact/contact.component';
import { ProfileComponent } from './profile/profile.component';

  const routes: Route[] = [
  {path: '', redirectTo: '/view1', pathMatch: 'full'},
  {path: 'view1',
  component: HelloWorldComponent
  /* children: [
    {path: 'profile', component: ProfileComponent},
    {path: 'contact', component: ContactComponent}
   ] */},
  {path: 'view2',component: DateComponent},
  {path: '**',component: PageNotFoundComponent}

];

@NgModule({
  declarations: [
    AppComponent,
    HelloWorldComponent,
    DateComponent,
    PageNotFoundComponent
  ],
  imports: [
     RouterModule.forRoot(routes),
    BrowserModule,
    FormsModule,
    ViewModule,
    HttpClientModule
  ],
  exports: [RouterModule],
  providers: [
    TestService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {


 }
