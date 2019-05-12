webpackJsonp(["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncatched exception popping up in devtools
	return Promise.resolve().then(function() {
		throw new Error("Cannot find module '" + req + "'.");
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app-routing.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* unused harmony export routes */
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppRoutingModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__components_main_main_component__ = __webpack_require__("./src/app/components/main/main.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__components_party_party_component__ = __webpack_require__("./src/app/components/party/party.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__components_monsters_monsters_component__ = __webpack_require__("./src/app/components/monsters/monsters.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__components_characters_characters_component__ = __webpack_require__("./src/app/components/characters/characters.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__components_login_login_component__ = __webpack_require__("./src/app/components/login/login.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__components_register_register_component__ = __webpack_require__("./src/app/components/register/register.component.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
// Modules


// Components






var routes = [
    { path: '', redirectTo: 'main', pathMatch: 'full' },
    { path: 'main', component: __WEBPACK_IMPORTED_MODULE_2__components_main_main_component__["a" /* MainComponent */] },
    { path: 'party', component: __WEBPACK_IMPORTED_MODULE_3__components_party_party_component__["a" /* PartyComponent */] },
    { path: 'dungeonmaster', component: __WEBPACK_IMPORTED_MODULE_4__components_monsters_monsters_component__["a" /* MonstersComponent */] },
    { path: 'character', component: __WEBPACK_IMPORTED_MODULE_5__components_characters_characters_component__["a" /* CharactersComponent */] },
    { path: 'createCampaign', component: __WEBPACK_IMPORTED_MODULE_7__components_register_register_component__["a" /* CreateCampaignComponent */] },
    { path: 'loginCampaign', component: __WEBPACK_IMPORTED_MODULE_6__components_login_login_component__["a" /* LoginComponent */] }
];
var AppRoutingModule = (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["I" /* NgModule */])({
            imports: [__WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* RouterModule */].forRoot(routes, { useHash: true })],
            exports: [__WEBPACK_IMPORTED_MODULE_1__angular_router__["b" /* RouterModule */]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/app.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/app.component.html":
/***/ (function(module, exports) {

module.exports = "<!-- Components are called by their selector -->\r\n<app-nav></app-nav>\r\n\r\n      <!-- This is where our route is injected -->\r\n      <router-outlet></router-outlet>  \r\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = (function () {
    function AppComponent() {
    }
    AppComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-root',
            template: __webpack_require__("./src/app/app.component.html"),
            styles: [__webpack_require__("./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__("./node_modules/@angular/platform-browser/esm5/platform-browser.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_forms__ = __webpack_require__("./node_modules/@angular/forms/esm5/forms.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__app_routing_module__ = __webpack_require__("./src/app/app-routing.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__app_component__ = __webpack_require__("./src/app/app.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__components_nav_nav_component__ = __webpack_require__("./src/app/components/nav/nav.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__components_main_main_component__ = __webpack_require__("./src/app/components/main/main.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__components_party_party_component__ = __webpack_require__("./src/app/components/party/party.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__components_characters_characters_component__ = __webpack_require__("./src/app/components/characters/characters.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__pipes_safe_pipe__ = __webpack_require__("./src/app/pipes/safe.pipe.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__components_login_login_component__ = __webpack_require__("./src/app/components/login/login.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__components_register_register_component__ = __webpack_require__("./src/app/components/register/register.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__angular_common_http__ = __webpack_require__("./node_modules/@angular/common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__services_dice_service__ = __webpack_require__("./src/app/services/dice.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__services_campaign_service__ = __webpack_require__("./src/app/services/campaign.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__session_custom_interceptor__ = __webpack_require__("./src/app/session/custom-interceptor.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16__services_characters_service__ = __webpack_require__("./src/app/services/characters.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_17__components_monsters_monsters_component__ = __webpack_require__("./src/app/components/monsters/monsters.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_18__services_monster_service__ = __webpack_require__("./src/app/services/monster.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
//Modules



// Routing

//Components








//Http Client

//Services






var AppModule = (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_1__angular_core__["I" /* NgModule */])({
            declarations: [
                __WEBPACK_IMPORTED_MODULE_4__app_component__["a" /* AppComponent */],
                __WEBPACK_IMPORTED_MODULE_5__components_nav_nav_component__["a" /* NavComponent */],
                __WEBPACK_IMPORTED_MODULE_6__components_main_main_component__["a" /* MainComponent */],
                __WEBPACK_IMPORTED_MODULE_7__components_party_party_component__["a" /* PartyComponent */],
                __WEBPACK_IMPORTED_MODULE_17__components_monsters_monsters_component__["a" /* MonstersComponent */],
                __WEBPACK_IMPORTED_MODULE_8__components_characters_characters_component__["a" /* CharactersComponent */],
                __WEBPACK_IMPORTED_MODULE_10__components_login_login_component__["a" /* LoginComponent */],
                __WEBPACK_IMPORTED_MODULE_11__components_register_register_component__["a" /* CreateCampaignComponent */],
                __WEBPACK_IMPORTED_MODULE_9__pipes_safe_pipe__["a" /* SafePipe */]
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */],
                __WEBPACK_IMPORTED_MODULE_3__app_routing_module__["a" /* AppRoutingModule */],
                __WEBPACK_IMPORTED_MODULE_2__angular_forms__["a" /* FormsModule */],
                __WEBPACK_IMPORTED_MODULE_12__angular_common_http__["c" /* HttpClientModule */]
            ],
            providers: [__WEBPACK_IMPORTED_MODULE_13__services_dice_service__["a" /* DiceService */],
                __WEBPACK_IMPORTED_MODULE_14__services_campaign_service__["a" /* CampaignService */],
                __WEBPACK_IMPORTED_MODULE_16__services_characters_service__["a" /* CharactersService */],
                __WEBPACK_IMPORTED_MODULE_18__services_monster_service__["a" /* MonsterService */], {
                    provide: __WEBPACK_IMPORTED_MODULE_12__angular_common_http__["a" /* HTTP_INTERCEPTORS */],
                    useClass: __WEBPACK_IMPORTED_MODULE_15__session_custom_interceptor__["a" /* CustomInterceptor */],
                    multi: true
                }, __WEBPACK_IMPORTED_MODULE_8__components_characters_characters_component__["a" /* CharactersComponent */]],
            bootstrap: [__WEBPACK_IMPORTED_MODULE_4__app_component__["a" /* AppComponent */]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/components/characters/characters.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/characters/characters.component.html":
/***/ (function(module, exports) {

module.exports = "<div class = \"panel panel-default\">\r\n    <div>\r\n        <div class=\"panel-heading\">\r\n            <span class=\"label label-default label-center\">Character Creation</span>\r\n        </div>\r\n        <div class=\"panel-body\">\r\n            <div class=\"col-md-3\">\r\n                <h3 class=\"text-center\">Race:</h3> \r\n                <button type=\"button\" (click)=\"getRace()\">Random Race</button><br><br>\r\n                <input type=\"text\" [(ngModel)]=\"character.charRace\"/>\r\n                <a href=\"https://forgottenrealms.fandom.com/wiki/{{character.charRace}}\" target=\"_blank\"><i class=\"glyphicon glyphicon-question-sign\"></i></a><br><br>\r\n                <h3 class=\"text-center\">Name:</h3> \r\n                <button type=\"button\" (click)=\"getName()\">Random Name</button><br><br> \r\n                <input type=\"text\" [(ngModel)]=\"character.charName\"/><br><br>                                            \r\n                <h3 class=\"text-center\">Class:</h3>\r\n                <button type=\"button\" (click)=\"getClass()\">Random Class</button><br><br>\r\n                <input type=\"text\" [(ngModel)]=\"character.charClass\"/>\r\n                <a href=\"https://forgottenrealms.fandom.com/wiki/{{character.charClass}}\" target=\"_blank\"><i class=\"glyphicon glyphicon-question-sign\"></i></a><br>\r\n            </div>  \r\n            <div class=\"col-md-3\">\r\n                <h3 class=\"text-center\">Equipment:</h3>\r\n                <button type=\"button\" (click)=\"getEquipment()\">Class lvl1 Equipment</button><br><br> \r\n                <textarea rows=\"20\" cols=\"40\" [(ngModel)]=\"character.equipment\"></textarea><br><br>                   \r\n            </div>\r\n            <div class=\"col-md-3\">        \r\n                    <h3 class=\"text-center\"> Skills/Spells:</h3> <br><br>\r\n                    <textarea [(ngModel)]=\"character.skills\" rows=\"20\" cols=\"40\"></textarea>\r\n                </div>\r\n            <div class=\"col-md-3\">\r\n                <h3 class=\"text-center\">Ability Score: <a href=\"https://www.dandwiki.com/wiki/5e_SRD:Ability_Scores\" target=\"_blank\"><i class=\"glyphicon glyphicon-question-sign\"></i></a></h3>\r\n                <button type=\"button\" (click)=\"getStats()\">Random Ability</button><br><br>\r\n                Str: <input type=\"text\" [(ngModel)]=\"character.str\"/><br><br>\r\n                Dex: <input type=\"text\" [(ngModel)]=\"character.dex\"/><br><br>\r\n                Con: <input type=\"text\" [(ngModel)]=\"character.con\"/><br><br>\r\n                Int: <input type=\"text\" [(ngModel)]=\"character.int\"/><br><br>\r\n                Wis: <input type=\"text\" [(ngModel)]=\"character.wis\"/><br><br>\r\n                Cha: <input type=\"text\" [(ngModel)]=\"character.cha\"/><br><br>\r\n                <button type=\"button\" (click)=\"saveCharacter()\">Create Character</button>\r\n                \r\n            </div>\r\n        </div>\r\n    </div>\r\n</div>"

/***/ }),

/***/ "./src/app/components/characters/characters.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CharactersComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_characters_service__ = __webpack_require__("./src/app/services/characters.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__models_characters_model__ = __webpack_require__("./src/app/models/characters.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__models_client_message_model__ = __webpack_require__("./src/app/models/client-message.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var CharactersComponent = (function () {
    function CharactersComponent(characterService, router) {
        this.characterService = characterService;
        this.title = 'Character Sheet';
        this.clientMessage = new __WEBPACK_IMPORTED_MODULE_3__models_client_message_model__["a" /* ClientMessage */]('');
        this.savedCharacter = new __WEBPACK_IMPORTED_MODULE_3__models_client_message_model__["a" /* ClientMessage */]('');
        this.character = new __WEBPACK_IMPORTED_MODULE_2__models_characters_model__["a" /* Characters */](0, "", 0, 0, "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        this.classs = "";
        this.router = router;
    }
    CharactersComponent.prototype.getRace = function () {
        var _this = this;
        this.characterService.getRace()
            .subscribe(function (data) { return _this.character = data; }, function (error) { return _this.clientMessage.message = error; });
    };
    CharactersComponent.prototype.getName = function () {
        var _this = this;
        this.characterService.getName()
            .subscribe(function (data) { return _this.character = data; }, function (error) { return _this.clientMessage.message = error; });
    };
    CharactersComponent.prototype.getClass = function () {
        var _this = this;
        this.characterService.getClass()
            .subscribe(function (data) { return _this.character = data; }, function (error) { return _this.clientMessage.message = error; });
    };
    CharactersComponent.prototype.getStats = function () {
        var _this = this;
        this.characterService.getStats()
            .subscribe(function (data) {
            _this.character = data;
            var stats = _this.character.stats.split(",", 6);
            _this.character.str = stats[0];
            _this.character.dex = stats[1];
            _this.character.con = stats[2];
            _this.character.int = stats[3];
            _this.character.wis = stats[4];
            _this.character.cha = stats[5];
        }, function (error) { return _this.clientMessage.message = error; });
    };
    CharactersComponent.prototype.saveCharacter = function () {
        var _this = this;
        this.characterService.createCharacter(this.character).subscribe(function (data) { return _this.savedCharacter = data; }, function (error) { return _this.clientMessage.message = error; }, function () { return _this.router.navigate(['/party']); });
    };
    CharactersComponent.prototype.getEquipment = function () {
        var _this = this;
        if (this.character.charClass != "") {
            this.characterService.getEquipment(this.character.charClass)
                .subscribe(function (data) { return _this.character = data; }, function (error) { return _this.clientMessage.message = error; });
        }
    };
    CharactersComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-characters',
            template: __webpack_require__("./src/app/components/characters/characters.component.html"),
            styles: [__webpack_require__("./src/app/components/characters/characters.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__services_characters_service__["a" /* CharactersService */], __WEBPACK_IMPORTED_MODULE_4__angular_router__["a" /* Router */]])
    ], CharactersComponent);
    return CharactersComponent;
}());



/***/ }),

/***/ "./src/app/components/login/login.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/login/login.component.html":
/***/ (function(module, exports) {

module.exports = "<div>\r\n  <div class=\"panel-heading\">\r\n      <span class=\"label label-default label-center\">Login to Campaign</span>\r\n  </div>\r\n  <div class=\"panel-body\">\r\n  <div class=\"list-group\">\r\n      <div class=\"list-group-item list-group-item-demo\">\r\n             <div class=\"form-group\">\r\n                  <input [(ngModel)]=\"username\" placeholder=\"Campaign Name\" class=\"form-control\" />\r\n                  <input type=password [(ngModel)]=\"password\" placeholder=\"Campaign Password\" class=\"form-control\" />\r\n             </div>\r\n             <div>\r\n                 <button class=\"btn btn-primary btn-center\" (click)=\"onSubmit()\">Login</button>\r\n             </div>\r\n             <div>\r\n                 {{ clientMessage.message }}\r\n             </div>\r\n      </div>\r\n  </div>"

/***/ }),

/***/ "./src/app/components/login/login.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return LoginComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_campaign_service__ = __webpack_require__("./src/app/services/campaign.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__models_campaign_model__ = __webpack_require__("./src/app/models/campaign.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__models_client_message_model__ = __webpack_require__("./src/app/models/client-message.model.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var LoginComponent = (function () {
    function LoginComponent(router, campaignService) {
        this.router = router;
        this.campaignService = campaignService;
        this.campaign = new __WEBPACK_IMPORTED_MODULE_2__models_campaign_model__["a" /* Campaign */](0, "", "", 0, 0, 0, 0, 0, 0);
        this.campaignData = new __WEBPACK_IMPORTED_MODULE_2__models_campaign_model__["a" /* Campaign */](0, "", "", 0, 0, 0, 0, 0, 0);
        this.clientMessage = new __WEBPACK_IMPORTED_MODULE_4__models_client_message_model__["a" /* ClientMessage */]('');
    }
    LoginComponent.prototype.onSubmit = function () {
        var _this = this;
        this.campaignService.loginCampaign(this.username, this.password)
            .subscribe(function (data) { return _this.campaignData = data; }, function (error) { return _this.clientMessage.message = 'Invalid username or password'; }, function () { return _this.router.navigate(['/party']); });
    };
    LoginComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-login',
            template: __webpack_require__("./src/app/components/login/login.component.html"),
            styles: [__webpack_require__("./src/app/components/login/login.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_3__angular_router__["a" /* Router */], __WEBPACK_IMPORTED_MODULE_1__services_campaign_service__["a" /* CampaignService */]])
    ], LoginComponent);
    return LoginComponent;
}());



/***/ }),

/***/ "./src/app/components/main/main.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/main/main.component.html":
/***/ (function(module, exports) {

module.exports = "<div>\r\n    <div class=\"panel-heading\">\r\n        <span class=\"label label-default label-center\">{{title}}</span>\r\n    </div>\r\n    <div class=\"panel-body\">\r\n    <img class=\"image-center\" src=\"{{image}}\" />\r\n    <div class=\"list-group\">\r\n        <div class=\"list-group-item\">\r\n            <span class=\"glyphicon glyphicon-arrow-right\" aria-hidden=\"true\"></span>\r\n            <a [href]=\"beginnerCampaigns\" target=\"_blank\"><strong>Suggested Beginner Campaigns for DMs</strong></a>\r\n        </div>\r\n        <div class=\"list-group-item\">\r\n            <span class=\"glyphicon glyphicon-arrow-right\" aria-hidden=\"true\"></span>\r\n            <a routerLink=\"/createCampaign\"><strong>Create a Campaign</strong></a>\r\n        </div>\r\n        <div class=\"list-group-item\">\r\n            <span class=\"glyphicon glyphicon-arrow-right\" aria-hidden=\"true\"></span>\r\n            <a routerLink=\"/loginCampaign\"><strong>Join Your Campaign</strong></a>\r\n        </div>\r\n    </div>\r\n</div>"

/***/ }),

/***/ "./src/app/components/main/main.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MainComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var MainComponent = (function () {
    function MainComponent() {
        this.title = 'D&D Portal';
        this.image = 'https://proxy.duckduckgo.com/iu/?u=http%3A%2F%2Fpop-verse.com%2Fwp-content%2Fuploads%2F2015%2F08%2FDungeons_and_Dragons_4th_Edition_Logo.jpg&f=1';
        this.beginnerCampaigns = 'http://www.dndadventure.com/html/adventures/adv1.html';
    }
    MainComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-main',
            template: __webpack_require__("./src/app/components/main/main.component.html"),
            styles: [__webpack_require__("./src/app/components/main/main.component.css")]
        })
    ], MainComponent);
    return MainComponent;
}());



/***/ }),

/***/ "./src/app/components/monsters/monsters.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/monsters/monsters.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"row\">\r\n    <div class=\"col-md-3\">\r\n        <div class=\"jumbotron\">\r\n            <div class=\"btn-group text-center\">\r\n                <button type=\"button\" (click)=\"diceClick('d4')\">Roll d4</button>\r\n                <button type=\"button\" (click)=\"diceClick('d6')\">Roll d6</button>\r\n                <button type=\"button\" (click)=\"diceClick('d8')\">Roll d8</button>\r\n                <button type=\"button\" (click)=\"diceClick('d10')\">Roll d10</button>\r\n                <button type=\"button\" (click)=\"diceClick('d12')\">Roll d12</button>\r\n                <button type=\"button\" (click)=\"diceClick('d20')\">Roll d20</button>\r\n                <button type=\"button\" (click)=\"diceClick('d100')\">Roll d100</button>\r\n            </div>\r\n            <div *ngIf=\"dice\">\r\n                Rolled a {{dice.type}}, Result = {{dice.value}}\r\n            </div>\r\n            <div>\r\n                <h4 class=\"text-center\">Previous 10 Rolls</h4>\r\n                <table class=\"table table-hover table-striped text-center\">\r\n                    <thead>\r\n                        <tr>\r\n                            <th>Type</th>\r\n                            <th>Value</th>\r\n                        </tr>\r\n                    </thead>\r\n                    <tbody *ngFor=\"let die of diceRolls\">\r\n                        <tr>\r\n                            <td>{{die.type}}</td>\r\n                            <td>{{die.value}}</td>\r\n                        </tr>\r\n                    </tbody>\r\n                </table>\r\n            </div>\r\n        </div>\r\n    </div>\r\n    <div class=\"col-md-9\">\r\n      <div class=\"jumbotron\">\r\n        <iframe [src]=\"groupBoardUrl | safe\" width=\"100%\" height=\"600\" scrolling=\"no\" frameborder=\"0\"></iframe>\r\n      </div>\r\n    </div>\r\n</div>\r\n\r\n\r\n<select [(ngModel)]=\"monster.url\">\r\n  <option *ngFor=\"let monsterOption of monsterList\" [value]=\"monsterOption.url\">{{monsterOption.name}}</option>\r\n</select>\r\n<button type=\"button\" (click)=\"getMonster()\">Show Monster</button>\r\n\r\n\r\n<div class=\"panel panel-default\">\r\n  <div>\r\n    <div class=\"panel-heading\">\r\n      <a href=\"https://forgottenrealms.fandom.com/wiki/{{monster.name}}\" target=\"_blank\"><span class=\"label label-default label-center\">{{monster.name}}</span></a>\r\n    </div>\r\n    <div class=\"panel-body\" *ngIf=\"monster.name != ''\">\r\n      <div class=\"col-md-2\">\r\n        <h3 class=\"text-center\">Attributes</h3>\r\n        Strength: {{monster.strength}}<br>\r\n        Dexterity: {{monster.dexterity}}<br>\r\n        Constitution: {{monster.constitution}}<br>\r\n        Intelligence: {{monster.intelligence}}<br>\r\n        Wisdom: {{monster.wisdom}}<br>\r\n        Charisma: {{monster.charisma}}<br><br>\r\n        <h3 class=\"text-center\">Stats</h3>\r\n        Size: {{monster.size}}<br>\r\n        Speed: {{monster.speed}}<br>\r\n        Armor Class: {{monster.armor_class}}<br>\r\n        Hit Points: {{monster.hit_points}}<br>\r\n        Hit Dice: {{monster.hit_dice}}<br>\r\n        Perception: {{monster.perception}}<br>\r\n        Senses: {{monster.senses}}<br>\r\n        <h3 class=\"text-center\">Vulnerabilities/Immunities</h3>\r\n        Damage Vulnerabilities: {{monster.damage_vulnerabilities}}<br>\r\n        Damage Resistance: {{monster.damage_resistance}}<br>\r\n        Damage Immunities: {{monster.damage_immunities}}<br>\r\n        Condition Immunities: {{monster.condition_immunities}}<br>\r\n      </div>\r\n      <div class=\"col-md-5\">\r\n        <h3 class=\"text-center\">Actions</h3>\r\n        <div class=\"jumbotron\" *ngFor=\"let action of actions\">\r\n          <span *ngIf=\"action.name\"><strong>{{action.name}}</strong></span><br>\r\n          <span *ngIf=\"action.desc\">Description: {{action.desc}}<br></span>\r\n          <span *ngIf=\"action.attack_bonus\">Attack Bonus: {{action.attack_bonus}}<br></span>\r\n          <span *ngIf=\"action.damage_bonus\">Damage Bonus: {{action.damage_bonus}}<br></span>\r\n          <span *ngIf=\"action.damage_dice\">Damage Dice: {{action.damage_dice}}<br></span>\r\n        </div>\r\n      </div>\r\n      <div class=\"col-md-5\">\r\n        <h3 class=\"text-center\">Legendary Actions</h3>\r\n        <div class=\"jumbotron\" *ngFor=\"let legendaryAction of legendaryActions\">\r\n          <span *ngIf=\"legendaryAction.name\"><strong>{{legendaryAction.name}}</strong></span><br>\r\n          <span *ngIf=\"legendaryAction.desc\">Description: {{legendaryAction.desc}}<br></span>\r\n          <span *ngIf=\"legendaryAction.attack_bonus\">Attack Bonus: {{legendaryAction.attack_bonus}}<br></span>\r\n        </div>\r\n      </div>\r\n      <div class=\"col-md-2\"></div>\r\n      <div class=\"col-md-5\">\r\n        <h3 class=\"text-center\">Special Abilities</h3>\r\n        <div class=\"jumbotron\" *ngFor=\"let specialAbility of specialAbilities\">\r\n          <span *ngIf=\"specialAbility.name\"><strong>{{specialAbility.name}}</strong></span><br>\r\n          <span *ngIf=\"specialAbility.desc\">Description: {{specialAbility.desc}}<br></span>\r\n          <span *ngIf=\"specialAbility.attack_bonus\">Attack Bonus: {{specialAbility.attack_bonus}}<br></span>\r\n        </div>\r\n      </div>\r\n    </div>\r\n  </div>\r\n</div>\r\n"

/***/ }),

/***/ "./src/app/components/monsters/monsters.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MonstersComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__models_monster_model__ = __webpack_require__("./src/app/models/monster.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_monster_service__ = __webpack_require__("./src/app/services/monster.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__models_client_message_model__ = __webpack_require__("./src/app/models/client-message.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__models_dice_model__ = __webpack_require__("./src/app/models/dice.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__services_dice_service__ = __webpack_require__("./src/app/services/dice.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var MonstersComponent = (function () {
    function MonstersComponent(monsterService, diceService) {
        this.monsterService = monsterService;
        this.diceService = diceService;
        this.groupBoardUrl = 'http://www.groupboard.com/gb/769351';
        this.clientMessage = new __WEBPACK_IMPORTED_MODULE_3__models_client_message_model__["a" /* ClientMessage */]('');
        this.diceRolls = [];
        //To display monsters in dropdown select field
        this.monsterList = [];
        //To display selected monster
        this.monster = new __WEBPACK_IMPORTED_MODULE_1__models_monster_model__["a" /* Monster */]("", 0, "", "", "", "", "", 0, 0, "", "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", "", "", "", "", "", "", [], [], [], "");
        this.actions = this.monster.actions;
        this.legendaryActions = this.monster.legendary_actions;
        this.specialAbilities = this.monster.special_abilities;
    }
    MonstersComponent.prototype.ngOnInit = function () {
        this.getMonsters();
    };
    MonstersComponent.prototype.diceClick = function (sides) {
        this.dieRolled = sides;
        this.roll(new __WEBPACK_IMPORTED_MODULE_4__models_dice_model__["a" /* Dice */](sides, 0));
    };
    MonstersComponent.prototype.roll = function (diceInput) {
        var _this = this;
        this.diceService.roll(diceInput)
            .subscribe(function (data) {
            _this.dice = data[0];
            _this.diceRolls.unshift(data[0]);
            if (_this.diceRolls.length > 10) {
                _this.diceRolls.pop();
            }
        }, function (error) { return _this.clientMessage.message = error; });
    };
    MonstersComponent.prototype.getMonster = function () {
        var _this = this;
        this.monsterService.getMonster(this.monster).subscribe(function (data) {
            _this.monster = data;
            _this.actions = _this.monster.actions;
            _this.legendaryActions = _this.monster.legendary_actions;
            _this.specialAbilities = _this.monster.special_abilities;
        }, function (error) { return _this.clientMessage.message = error; });
    };
    MonstersComponent.prototype.getMonsters = function () {
        var _this = this;
        this.monsterService.getMonsters().subscribe(function (data) { return _this.monsterList = data; }, function (error) { return _this.clientMessage.message = error; });
    };
    MonstersComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-monsters',
            template: __webpack_require__("./src/app/components/monsters/monsters.component.html"),
            styles: [__webpack_require__("./src/app/components/monsters/monsters.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__services_monster_service__["a" /* MonsterService */], __WEBPACK_IMPORTED_MODULE_5__services_dice_service__["a" /* DiceService */]])
    ], MonstersComponent);
    return MonstersComponent;
}());



/***/ }),

/***/ "./src/app/components/nav/nav.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/nav/nav.component.html":
/***/ (function(module, exports) {

module.exports = "<nav class=\"navbar navbar-inverse\">\r\n  <div class=\"container-fluid\">\r\n    <div class=\"navbar-header\">\r\n      <a class=\"navbar-brand\" routerLink=\"/\">D&D Platform</a>\r\n    </div>\r\n    <ul class=\"nav navbar-nav\">\r\n      <li><a routerLink=\"/createCampaign\">Create Campaign</a></li>\r\n\t\t\t<li><a routerLink=\"/loginCampaign\">Login to Campaign</a></li>\r\n      <li><a routerLink=\"/party\">Party Screen</a></li>\r\n      <li><a (click)=\"logout()\">Leave Session</a></li>\r\n    </ul>\r\n  </div>\r\n</nav>"

/***/ }),

/***/ "./src/app/components/nav/nav.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return NavComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_campaign_service__ = __webpack_require__("./src/app/services/campaign.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var NavComponent = (function () {
    function NavComponent(campaignService, router) {
        this.campaignService = campaignService;
        this.router = router;
    }
    NavComponent.prototype.logout = function () {
        var _this = this;
        this.campaignService.logout()
            .subscribe(function (data) { return window.alert(data.message); }, function (error) { return window.alert(error.message); }, function () { return _this.router.navigate(['/main']); });
    };
    NavComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-nav',
            template: __webpack_require__("./src/app/components/nav/nav.component.html"),
            styles: [__webpack_require__("./src/app/components/nav/nav.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__services_campaign_service__["a" /* CampaignService */], __WEBPACK_IMPORTED_MODULE_2__angular_router__["a" /* Router */]])
    ], NavComponent);
    return NavComponent;
}());



/***/ }),

/***/ "./src/app/components/party/party.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/party/party.component.html":
/***/ (function(module, exports) {

module.exports = "<h1 class=\"text-center\">{{campaign.campaignName}}</h1>\r\n\r\n<br>\r\n<h4>*Dungeon Master Tools*</h4>\r\n<a routerLink=\"../dungeonmaster\"><button type=\"button\">To Dungeon Master View</button></a>\r\n<br><br>\r\n\r\n<div class=\"row\">\r\n    <div class=\"col-md-3\">\r\n        <div class=\"jumbotron\">\r\n            <div class=\"btn-group text-center\">\r\n                <button type=\"button\" (click)=\"diceClick('d4')\">Roll d4</button>\r\n                <button type=\"button\" (click)=\"diceClick('d6')\">Roll d6</button>\r\n                <button type=\"button\" (click)=\"diceClick('d8')\">Roll d8</button>\r\n                <button type=\"button\" (click)=\"diceClick('d10')\">Roll d10</button>\r\n                <button type=\"button\" (click)=\"diceClick('d12')\">Roll d12</button>\r\n                <button type=\"button\" (click)=\"diceClick('d20')\">Roll d20</button>\r\n                <button type=\"button\" (click)=\"diceClick('d100')\">Roll d100</button>\r\n            </div>\r\n            <div *ngIf=\"dice\">\r\n                Rolled a {{dice.type}}, Result = {{dice.value}}\r\n            </div>\r\n            <div>\r\n                <h4 class=\"text-center\">Previous 10 Rolls</h4>\r\n                <table class=\"table table-hover table-striped text-center\">\r\n                    <thead>\r\n                        <tr>\r\n                            <th>Type</th>\r\n                            <th>Value</th>\r\n                        </tr>\r\n                    </thead>\r\n                    <tbody *ngFor=\"let die of diceRolls\">\r\n                        <tr>\r\n                            <td>{{die.type}}</td>\r\n                            <td>{{die.value}}</td>\r\n                        </tr>\r\n                    </tbody>\r\n                </table>\r\n            </div>\r\n        </div>\r\n    </div>\r\n    <div class=\"col-md-9\">\r\n        <div class=\"jumbotron\">\r\n                <iframe [src]=\"groupBoardUrl | safe\" width=\"100%\" height=\"600\" scrolling=\"no\" frameborder=\"0\"></iframe>\r\n        </div>\r\n    </div>\r\n</div>\r\n\r\n<br>\r\n\r\n<h2>Player Notes *Not Saved Between Sessions*</h2>\r\n<textarea cols=\"75%\" rows=5></textarea>\r\n\r\n<br>\r\n\r\n<button type=\"button\" (click)=\"getCharacters()\">Load/Refresh Character List</button>\r\n<div class=\"row\">\r\n    <div class=\"col-md-4\">\r\n        <div class=\"jumbotron\">\r\n            <div *ngIf=\"char1\">\r\n                <div class=\"container-fluid\">\r\n                    <div class=\"col-md-6\">\r\n                        <strong>{{char1.charName}}</strong> <br>\r\n                        Level: <input type=\"text\" [(ngModel)]=\"char1.charLvl\" /><br>\r\n                        Race: {{char1.charRace}}<br>\r\n                        Class: {{char1.charClass}}<br>\r\n                        Experience: <input type=\"text\" [(ngModel)]=\"char1.charExp\" />\r\n                    </div>\r\n                    <div class=\"col-md-6\">\r\n                        <strong>Attributes</strong><br>\r\n                        Strength: {{char1.str}}<br>\r\n                        Dexterity: {{char1.dex}}<br>\r\n                        Constitution: {{char1.con}}<br>\r\n                        Intelligence: {{char1.int}}<br>\r\n                        Wisdom: {{char1.wis}}<br>\r\n                        Charisma: {{char1.cha}}<br>\r\n                    </div> \r\n                </div>\r\n                <br>\r\n                <div class=\"container-fluid\">\r\n                    <div class=\"col-md-6\">\r\n                        <strong>Equipment</strong> <br>\r\n                        <textarea [(ngModel)]=\"char1.equipment\"></textarea>\r\n                    </div>\r\n                    <div class=\"col-md-6\">\r\n                        <strong>Skill/Spells</strong><br>\r\n                        <textarea [(ngModel)]=\"char1.skills\"></textarea>\r\n                    </div> \r\n                </div> \r\n                <button type=\"button\" (click)=\"saveChar(char1)\">Save Character</button>\r\n            </div>\r\n            <span *ngIf=\"!char1\"><a routerLink=\"../character\"><button type=\"button\">Add Character</button></a></span>\r\n        </div>\r\n    </div>\r\n    <div class=\"col-md-4\">\r\n        <div class=\"jumbotron\">\r\n            <div *ngIf=\"char2\">\r\n            <div class=\"container-fluid\">\r\n                    <div class=\"col-md-6\">\r\n                        <strong>{{char2.charName}}</strong> <br>\r\n                        Level: <input type=\"text\" [(ngModel)]=\"char2.charLvl\" /><br>\r\n                        Race: {{char2.charRace}}<br>\r\n                        Class: {{char2.charClass}}<br>\r\n                        Experience: <input type=\"text\" [(ngModel)]=\"char2.charExp\" />\r\n                    </div>\r\n                    <div class=\"col-md-6\">\r\n                        <strong>Attributes</strong><br>\r\n                        Strength: {{char2.str}}<br>\r\n                        Dexterity: {{char2.dex}}<br>\r\n                        Constitution: {{char2.con}}<br>\r\n                        Intelligence: {{char2.int}}<br>\r\n                        Wisdom: {{char2.wis}}<br>\r\n                        Charisma: {{char2.cha}}<br>\r\n                    </div> \r\n                </div>\r\n                <br>\r\n                <div class=\"container-fluid\">\r\n                    <div class=\"col-md-6\">\r\n                        <strong>Equipment</strong> <br>\r\n                        <textarea [(ngModel)]=\"char2.equipment\"></textarea>\r\n                    </div>\r\n                    <div class=\"col-md-6\">\r\n                        <strong>Skill/Spells</strong><br>\r\n                        <textarea [(ngModel)]=\"char2.skills\"></textarea>\r\n                    </div> \r\n                </div> \r\n                <button type=\"button\" (click)=\"saveChar(char2)\">Save Character</button>\r\n            </div>\r\n            <span *ngIf=\"!char2\"><a routerLink=\"../character\"><button type=\"button\">Add Character</button></a></span>\r\n        </div>\r\n    </div>\r\n    <div class=\"col-md-4\">\r\n        <div class=\"jumbotron\">\r\n            <div *ngIf=\"char3\">\r\n            <div class=\"container-fluid\">\r\n                    <div class=\"col-md-6\">\r\n                        <strong>{{char3.charName}}</strong> <br>\r\n                        Level: <input type=\"text\" [(ngModel)]=\"char3.charLvl\" /><br>\r\n                        Race: {{char3.charRace}}<br>\r\n                        Class: {{char3.charClass}}<br>\r\n                        Experience: <input type=\"text\" [(ngModel)]=\"char3.charExp\" />\r\n                    </div>\r\n                    <div class=\"col-md-6\">\r\n                        <strong>Attributes</strong><br>\r\n                        Strength: {{char3.str}}<br>\r\n                        Dexterity: {{char3.dex}}<br>\r\n                        Constitution: {{char3.con}}<br>\r\n                        Intelligence: {{char3.int}}<br>\r\n                        Wisdom: {{char3.wis}}<br>\r\n                        Charisma: {{char3.cha}}<br>\r\n                    </div> \r\n                </div>\r\n                <br>\r\n                <div class=\"container-fluid\">\r\n                    <div class=\"col-md-6\">\r\n                        <strong>Equipment</strong> <br>\r\n                        <textarea [(ngModel)]=\"char3.equipment\"></textarea>\r\n                    </div>\r\n                    <div class=\"col-md-6\">\r\n                        <strong>Skill/Spells</strong><br>\r\n                        <textarea [(ngModel)]=\"char3.skills\"></textarea>\r\n                    </div> \r\n                </div> \r\n                <button type=\"button\" (click)=\"saveChar(char3)\">Save Character</button>\r\n            </div>\r\n            <span *ngIf=\"!char3\"><a routerLink=\"../character\"><button type=\"button\">Add Character</button></a></span>\r\n        </div>\r\n    </div>\r\n</div>\r\n<div class=\"row\">\r\n    <div class=\"col-md-4\">\r\n        <div class=\"jumbotron\">\r\n            <div *ngIf=\"char4\">\r\n                <div class=\"container-fluid\">\r\n                        <div class=\"col-md-6\">\r\n                            <strong>{{char4.charName}}</strong> <br>\r\n                            Level: <input type=\"text\" [(ngModel)]=\"char4.charLvl\" /><br>\r\n                            Race: {{char4.charRace}}<br>\r\n                            Class: {{char4.charClass}}<br>\r\n                            Experience: <input type=\"text\" [(ngModel)]=\"char4.charExp\" />\r\n                        </div>\r\n                        <div class=\"col-md-6\">\r\n                            <strong>Attributes</strong><br>\r\n                            Strength: {{char4.str}}<br>\r\n                            Dexterity: {{char4.dex}}<br>\r\n                            Constitution: {{char4.con}}<br>\r\n                            Intelligence: {{char4.int}}<br>\r\n                            Wisdom: {{char4.wis}}<br>\r\n                            Charisma: {{char4.cha}}<br>\r\n                        </div> \r\n                    </div>\r\n                    <br>\r\n                    <div class=\"container-fluid\">\r\n                        <div class=\"col-md-6\">\r\n                            <strong>Equipment</strong> <br>\r\n                            <textarea [(ngModel)]=\"char4.equipment\"></textarea>\r\n                        </div>\r\n                        <div class=\"col-md-6\">\r\n                            <strong>Skill/Spells</strong><br>\r\n                            <textarea [(ngModel)]=\"char4.skills\"></textarea>\r\n                        </div> \r\n                    </div> \r\n                    <button type=\"button\" (click)=\"saveChar(char4)\">Save Character</button>\r\n                </div>\r\n            <span *ngIf=\"!char4\"><a routerLink=\"../character\"><button type=\"button\">Add Character</button></a></span>\r\n        </div>\r\n    </div>\r\n    <div class=\"col-md-4\">\r\n        <div class=\"jumbotron\">\r\n            <div *ngIf=\"char5\">\r\n                    <div class=\"container-fluid\">\r\n                            <div class=\"col-md-6\">\r\n                                <strong>{{char5.charName}}</strong> <br>\r\n                                Level: <input type=\"text\" [(ngModel)]=\"char5.charLvl\" /><br>\r\n                                Race: {{char5.charRace}}<br>\r\n                                Class: {{char5.charClass}}<br>\r\n                                Experience: <input type=\"text\" [(ngModel)]=\"char5.charExp\" />\r\n                            </div>\r\n                            <div class=\"col-md-6\">\r\n                                <strong>Attributes</strong><br>\r\n                                Strength: {{char5.str}}<br>\r\n                                Dexterity: {{char5.dex}}<br>\r\n                                Constitution: {{char5.con}}<br>\r\n                                Intelligence: {{char5.int}}<br>\r\n                                Wisdom: {{char5.wis}}<br>\r\n                                Charisma: {{char5.cha}}<br>\r\n                            </div> \r\n                        </div>\r\n                        <br>\r\n                        <div class=\"container-fluid\">\r\n                            <div class=\"col-md-6\">\r\n                                <strong>Equipment</strong> <br>\r\n                                <textarea [(ngModel)]=\"char5.equipment\"></textarea>\r\n                            </div>\r\n                            <div class=\"col-md-6\">\r\n                                <strong>Skill/Spells</strong><br>\r\n                                <textarea [(ngModel)]=\"char5.skills\"></textarea>\r\n                            </div> \r\n                        </div> \r\n                        <button type=\"button\" (click)=\"saveChar(char5)\">Save Character</button>\r\n                </div>\r\n            <span *ngIf=\"!char5\"><a routerLink=\"../character\"><button type=\"button\">Add Character</button></a></span>\r\n        </div>\r\n    </div>\r\n    <div class=\"col-md-4\">\r\n        <div class=\"jumbotron\">\r\n            <div *ngIf=\"char6\">\r\n                    <div class=\"container-fluid\">\r\n                            <div class=\"col-md-6\">\r\n                                <strong>{{char6.charName}}</strong> <br>\r\n                                Level: <input type=\"text\" [(ngModel)]=\"char6.charLvl\" /><br>\r\n                                Race: {{char1.charRace}}<br>\r\n                                Class: {{char1.charClass}}<br>\r\n                                Experience: <input type=\"text\" [(ngModel)]=\"char6.charExp\" />\r\n                            </div>\r\n                            <div class=\"col-md-6\">\r\n                                <strong>Attributes</strong><br>\r\n                                Strength: {{char6.str}}<br>\r\n                                Dexterity: {{char6.dex}}<br>\r\n                                Constitution: {{char6.con}}<br>\r\n                                Intelligence: {{char6.int}}<br>\r\n                                Wisdom: {{char6.wis}}<br>\r\n                                Charisma: {{char6.cha}}<br>\r\n                            </div> \r\n                        </div>\r\n                        <br>\r\n                        <div class=\"container-fluid\">\r\n                            <div class=\"col-md-6\">\r\n                                <strong>Equipment</strong> <br>\r\n                                <textarea [(ngModel)]=\"char6.equipment\"></textarea>\r\n                            </div>\r\n                            <div class=\"col-md-6\">\r\n                                <strong>Skill/Spells</strong><br>\r\n                                <textarea [(ngModel)]=\"char6.skills\"></textarea>\r\n                            </div> \r\n                        </div>\r\n                        <button type=\"button\" (click)=\"saveChar(char6)\">Save Character</button> \r\n                </div>\r\n            <span *ngIf=\"!char6\"><a routerLink=\"../character\"><button type=\"button\">Add Character</button></a></span>\r\n        </div>\r\n    </div>\r\n\r\n</div>"

/***/ }),

/***/ "./src/app/components/party/party.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return PartyComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__services_dice_service__ = __webpack_require__("./src/app/services/dice.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__models_dice_model__ = __webpack_require__("./src/app/models/dice.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__models_client_message_model__ = __webpack_require__("./src/app/models/client-message.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__services_campaign_service__ = __webpack_require__("./src/app/services/campaign.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__models_campaign_model__ = __webpack_require__("./src/app/models/campaign.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__models_characters_model__ = __webpack_require__("./src/app/models/characters.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__services_characters_service__ = __webpack_require__("./src/app/services/characters.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};








var PartyComponent = (function () {
    function PartyComponent(diceService, campaignService, charactersService) {
        this.diceService = diceService;
        this.campaignService = campaignService;
        this.charactersService = charactersService;
        this.title = 'Your Campaign';
        this.groupBoardUrl = 'http://www.groupboard.com/gb/769351';
        this.clientMessage = new __WEBPACK_IMPORTED_MODULE_3__models_client_message_model__["a" /* ClientMessage */]('');
        //Array of previous Dice rolls
        this.diceRolls = [];
        //To hold current campaign info
        this.campaign = new __WEBPACK_IMPORTED_MODULE_5__models_campaign_model__["a" /* Campaign */](1, "", "", 0, 0, 0, 0, 0, 0);
        //To hold current character info
        this.char = new __WEBPACK_IMPORTED_MODULE_6__models_characters_model__["a" /* Characters */](0, "", 0, 0, "", "", "", "", "", "", "", "", "", "", "", "", "", "");
    }
    PartyComponent.prototype.ngOnInit = function () {
        //find campaign for current session
        this.getCampaign();
        //find characters for current session
        //window.setTimeout(() => this.getCharacters, 500);
    };
    PartyComponent.prototype.diceClick = function (sides) {
        this.dieRolled = sides;
        this.roll(new __WEBPACK_IMPORTED_MODULE_2__models_dice_model__["a" /* Dice */](sides, 0));
    };
    PartyComponent.prototype.getCampaign = function () {
        var _this = this;
        this.campaignService.findCampaign(this.campaign)
            .subscribe(function (data) { return _this.campaign = data; }, function (error) { return _this.clientMessage.message = error; });
    };
    PartyComponent.prototype.saveChar = function (charToSave) {
        var _this = this;
        this.charactersService.saveCharacter(charToSave)
            .subscribe(function (data) { return _this.char = data; }, function (error) { return _this.clientMessage.message = error; });
    };
    PartyComponent.prototype.getCharacters = function () {
        var _this = this;
        this.char.charId = this.campaign.char1;
        this.charactersService.findCharacter(this.char)
            .subscribe(function (data) { return _this.char1 = data; }, function (error) { return _this.clientMessage.message = error; });
        this.char.charId = this.campaign.char2;
        this.charactersService.findCharacter(this.char)
            .subscribe(function (data) { return _this.char2 = data; }, function (error) { return _this.clientMessage.message = error; });
        this.char.charId = this.campaign.char3;
        this.charactersService.findCharacter(this.char)
            .subscribe(function (data) { return _this.char3 = data; }, function (error) { return _this.clientMessage.message = error; });
        this.char.charId = this.campaign.char4;
        this.charactersService.findCharacter(this.char)
            .subscribe(function (data) { return _this.char4 = data; }, function (error) { return _this.clientMessage.message = error; });
        this.char.charId = this.campaign.char5;
        this.charactersService.findCharacter(this.char)
            .subscribe(function (data) { return _this.char5 = data; }, function (error) { return _this.clientMessage.message = error; });
        this.char.charId = this.campaign.char6;
        this.charactersService.findCharacter(this.char)
            .subscribe(function (data) { return _this.char6 = data; }, function (error) { return _this.clientMessage.message = error; });
    };
    PartyComponent.prototype.roll = function (diceInput) {
        var _this = this;
        this.diceService.roll(diceInput)
            .subscribe(function (data) {
            _this.dice = data[0];
            _this.diceRolls.unshift(data[0]);
            if (_this.diceRolls.length > 10) {
                _this.diceRolls.pop();
            }
        }, function (error) { return _this.clientMessage.message = error; });
    };
    PartyComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-party',
            template: __webpack_require__("./src/app/components/party/party.component.html"),
            styles: [__webpack_require__("./src/app/components/party/party.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__services_dice_service__["a" /* DiceService */], __WEBPACK_IMPORTED_MODULE_4__services_campaign_service__["a" /* CampaignService */],
            __WEBPACK_IMPORTED_MODULE_7__services_characters_service__["a" /* CharactersService */]])
    ], PartyComponent);
    return PartyComponent;
}());



/***/ }),

/***/ "./src/app/components/register/register.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/components/register/register.component.html":
/***/ (function(module, exports) {

module.exports = "<div>\r\n    <div class=\"panel-heading\">\r\n        <span class=\"label label-default label-center\">Create Campaign</span>\r\n    </div>\r\n    <div class=\"panel-body\">\r\n    <div class=\"list-group\">\r\n        <div class=\"list-group-item list-group-item-demo\">\r\n               <div class=\"form-group\">\r\n                    <input [(ngModel)]=\"campaign.campaignName\" placeholder=\"Campaign Name\" class=\"form-control\" />\r\n                    <input type=password [(ngModel)]=\"campaign.campaignPass\" placeholder=\"Campaign Password\" class=\"form-control\" />\r\n               </div>\r\n               <div>\r\n                   <button class=\"btn btn-primary btn-center\" (click)=\"createCampaign()\">Create</button>\r\n               </div>\r\n               <div>\r\n                   {{ clientMessage.message }}\r\n               </div>\r\n        </div>\r\n    </div>\r\n"

/***/ }),

/***/ "./src/app/components/register/register.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CreateCampaignComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__models_client_message_model__ = __webpack_require__("./src/app/models/client-message.model.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__services_campaign_service__ = __webpack_require__("./src/app/services/campaign.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__models_campaign_model__ = __webpack_require__("./src/app/models/campaign.model.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var CreateCampaignComponent = (function () {
    //Constructor Injection
    function CreateCampaignComponent(campaignService) {
        this.campaignService = campaignService;
        //For data binding
        this.campaign = new __WEBPACK_IMPORTED_MODULE_3__models_campaign_model__["a" /* Campaign */](0, "", "", null, null, null, null, null, null);
        //To message the user
        this.clientMessage = new __WEBPACK_IMPORTED_MODULE_1__models_client_message_model__["a" /* ClientMessage */]('');
    }
    CreateCampaignComponent.prototype.createCampaign = function () {
        var _this = this;
        this.campaignService.registerCampaign(this.campaign)
            .subscribe(function (data) { return _this.clientMessage = data; }, function (error) { return _this.clientMessage.message = 'SOMETHING WENT WRONG.'; });
    };
    CreateCampaignComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-register',
            template: __webpack_require__("./src/app/components/register/register.component.html"),
            styles: [__webpack_require__("./src/app/components/register/register.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_2__services_campaign_service__["a" /* CampaignService */]])
    ], CreateCampaignComponent);
    return CreateCampaignComponent;
}());



/***/ }),

/***/ "./src/app/models/campaign.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Campaign; });
var Campaign = (function () {
    function Campaign(campaignId, campaignName, campaignPass, char1, char2, char3, char4, char5, char6) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.campaignPass = campaignPass;
        this.char1 = char1;
        this.char2 = char2;
        this.char3 = char3;
        this.char4 = char4;
        this.char5 = char5;
        this.char6 = char6;
    }
    return Campaign;
}());



/***/ }),

/***/ "./src/app/models/characters.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Characters; });
var Characters = (function () {
    function Characters(charId, charName, charLvl, charExp, equipment, items, skills, traits, stats, str, dex, con, int, wis, cha, attackSpells, charRace, charClass) {
        this.charId = charId;
        this.charName = charName;
        this.charLvl = charLvl;
        this.charExp = charExp;
        this.charClass = charClass;
        this.equipment = equipment;
        this.items = items;
        this.skills = skills;
        this.traits = traits;
        this.stats = stats;
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.int = int;
        this.wis = wis;
        this.cha = cha;
        this.attackSpells = attackSpells;
        this.charRace = charRace;
        this.charClass = charClass;
    }
    return Characters;
}());



/***/ }),

/***/ "./src/app/models/client-message.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return ClientMessage; });
var ClientMessage = (function () {
    function ClientMessage(message) {
        this.message = message;
    }
    return ClientMessage;
}());



/***/ }),

/***/ "./src/app/models/dice.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Dice; });
var Dice = (function () {
    function Dice(type, value) {
        this.type = type;
        this.value = value;
    }
    return Dice;
}());



/***/ }),

/***/ "./src/app/models/monster.model.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Monster; });
var Monster = (function () {
    function Monster(_id, index, name, size, type, subtype, alignment, armor_class, hit_points, hit_dice, speed, strength, dexterity, constitution, intelligence, wisdom, charisma, dexterity_save, constitution_save, wisdom_save, charisma_save, perception, stealth, damage_vulnerabilities, damage_resistance, damage_immunities, condition_immunities, senses, languages, challenge_rating, special_abilities, actions, legendary_actions, url) {
        this._id = _id;
        this.index = index;
        this.name = name;
        this.size = size;
        this.type = type;
        this.subtype = subtype;
        this.alignment = alignment;
        this.armor_class = armor_class;
        this.hit_points = hit_points;
        this.hit_dice = hit_dice;
        this.speed = speed;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.dexterity_save = dexterity_save;
        this.constitution_save = constitution_save;
        this.wisdom_save = wisdom_save;
        this.charisma_save = charisma_save;
        this.perception = perception;
        this.stealth = stealth;
        this.damage_vulnerabilities = damage_vulnerabilities;
        this.damage_resistance = damage_resistance;
        this.damage_immunities = damage_immunities;
        this.condition_immunities = condition_immunities;
        this.languages = languages;
        this.challenge_rating = challenge_rating;
        this.special_abilities = special_abilities;
        this.actions = actions;
        this.legendary_actions = legendary_actions;
        this.url = url;
    }
    return Monster;
}());



/***/ }),

/***/ "./src/app/pipes/safe.pipe.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return SafePipe; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__ = __webpack_require__("./node_modules/@angular/platform-browser/esm5/platform-browser.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var SafePipe = (function () {
    function SafePipe(sanitizer) {
        this.sanitizer = sanitizer;
    }
    SafePipe.prototype.transform = function (url) {
        return this.sanitizer.bypassSecurityTrustResourceUrl(url);
    };
    SafePipe = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["T" /* Pipe */])({ name: 'safe' }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser__["b" /* DomSanitizer */]])
    ], SafePipe);
    return SafePipe;
}());



/***/ }),

/***/ "./src/app/services/campaign.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CampaignService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common_http__ = __webpack_require__("./node_modules/@angular/common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__ = __webpack_require__("./node_modules/rxjs/_esm5/Observable.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_Rx__ = __webpack_require__("./node_modules/rxjs/_esm5/Rx.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__environments_environment__ = __webpack_require__("./src/environments/environment.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var CampaignService = (function () {
    function CampaignService(http) {
        this.http = http;
    }
    CampaignService.prototype.findAllCampaigns = function () {
        return this.http.get(__WEBPACK_IMPORTED_MODULE_4__environments_environment__["a" /* DND_URL */] + "campaign/all").catch(this.handleError);
    };
    CampaignService.prototype.findCampaign = function (campaign) {
        return this.http.get(__WEBPACK_IMPORTED_MODULE_4__environments_environment__["a" /* DND_URL */] + "campaign/find").catch(this.handleError);
    };
    CampaignService.prototype.registerCampaign = function (campaign) {
        return this.http.post(__WEBPACK_IMPORTED_MODULE_4__environments_environment__["a" /* DND_URL */] + "campaign/register", campaign).catch(this.handleError);
    };
    CampaignService.prototype.loginCampaign = function (username, password) {
        return this.http.post(__WEBPACK_IMPORTED_MODULE_4__environments_environment__["a" /* DND_URL */] + "campaign/loginToCampaign", [username, password]).catch(this.handleError);
    };
    CampaignService.prototype.logout = function () {
        return this.http.get(__WEBPACK_IMPORTED_MODULE_4__environments_environment__["a" /* DND_URL */] + "campaign/logout").catch(this.handleError);
    };
    CampaignService.prototype.handleError = function (error) {
        return __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__["a" /* Observable */].throw(error.statusText);
    };
    CampaignService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_common_http__["b" /* HttpClient */]])
    ], CampaignService);
    return CampaignService;
}());



/***/ }),

/***/ "./src/app/services/characters.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CharactersService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common_http__ = __webpack_require__("./node_modules/@angular/common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs__ = __webpack_require__("./node_modules/rxjs/Rx.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs___default = __webpack_require__.n(__WEBPACK_IMPORTED_MODULE_2_rxjs__);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_Rx__ = __webpack_require__("./node_modules/rxjs/_esm5/Rx.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__environments_environment__ = __webpack_require__("./src/environments/environment.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5_rxjs_Observable__ = __webpack_require__("./node_modules/rxjs/_esm5/Observable.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};






var CharactersService = (function () {
    function CharactersService(http) {
        this.http = http;
    }
    CharactersService.prototype.findCharacter = function (character) {
        return this.http.post(__WEBPACK_IMPORTED_MODULE_4__environments_environment__["a" /* DND_URL */] + "character/findCharacter", character).catch(this.handleError);
    };
    CharactersService.prototype.saveCharacter = function (character) {
        return this.http.put(__WEBPACK_IMPORTED_MODULE_4__environments_environment__["a" /* DND_URL */] + "character/save", character).catch(this.handleError);
    };
    CharactersService.prototype.createCharacter = function (character) {
        return this.http.post(__WEBPACK_IMPORTED_MODULE_4__environments_environment__["a" /* DND_URL */] + "character/register", character).catch(this.handleError);
    };
    CharactersService.prototype.getRace = function () {
        return this.http.get(__WEBPACK_IMPORTED_MODULE_4__environments_environment__["a" /* DND_URL */] + "character/race").catch(this.handleError);
    };
    CharactersService.prototype.getName = function () {
        return this.http.get(__WEBPACK_IMPORTED_MODULE_4__environments_environment__["a" /* DND_URL */] + "character/name").catch(this.handleError);
    };
    CharactersService.prototype.getClass = function () {
        return this.http.get(__WEBPACK_IMPORTED_MODULE_4__environments_environment__["a" /* DND_URL */] + "character/class").catch(this.handleError);
    };
    CharactersService.prototype.getStats = function () {
        return this.http.get(__WEBPACK_IMPORTED_MODULE_4__environments_environment__["a" /* DND_URL */] + "character/stats").catch(this.handleError);
    };
    CharactersService.prototype.getEquipment = function (classs) {
        return this.http.post(__WEBPACK_IMPORTED_MODULE_4__environments_environment__["a" /* DND_URL */] + "character/equipment", classs).catch(this.handleError);
    };
    CharactersService.prototype.handleError = function (error) {
        return __WEBPACK_IMPORTED_MODULE_2_rxjs__["Observable"].throw(error.statusText);
    };
    CharactersService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_common_http__["b" /* HttpClient */]])
    ], CharactersService);
    return CharactersService;
}());



/***/ }),

/***/ "./src/app/services/dice.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DiceService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common_http__ = __webpack_require__("./node_modules/@angular/common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__ = __webpack_require__("./node_modules/rxjs/_esm5/Observable.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__("./src/environments/environment.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4_rxjs_Rx__ = __webpack_require__("./node_modules/rxjs/_esm5/Rx.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var DiceService = (function () {
    function DiceService(http) {
        this.http = http;
    }
    DiceService.prototype.roll = function (dice) {
        return this.http
            .post(__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* DND_URL */] + "dice/roll", dice)
            .catch(this.handleError);
    };
    DiceService.prototype.handleError = function (error) {
        return __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__["a" /* Observable */].throw(error.statusText);
    };
    DiceService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_common_http__["b" /* HttpClient */]])
    ], DiceService);
    return DiceService;
}());



/***/ }),

/***/ "./src/app/services/monster.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MonsterService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common_http__ = __webpack_require__("./node_modules/@angular/common/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__ = __webpack_require__("./node_modules/rxjs/_esm5/Observable.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__("./src/environments/environment.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var MonsterService = (function () {
    function MonsterService(http) {
        this.http = http;
    }
    MonsterService.prototype.getMonsters = function () {
        return this.http.get(__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* DND_URL */] + "monster/all").catch(this.handleError);
    };
    MonsterService.prototype.getMonster = function (monster) {
        return this.http.post(__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* DND_URL */] + "monster/find", monster).catch(this.handleError);
    };
    MonsterService.prototype.handleError = function (error) {
        return __WEBPACK_IMPORTED_MODULE_2_rxjs_Observable__["a" /* Observable */].throw(error.statusText);
    };
    MonsterService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_common_http__["b" /* HttpClient */]])
    ], MonsterService);
    return MonsterService;
}());



/***/ }),

/***/ "./src/app/session/custom-interceptor.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CustomInterceptor; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var CustomInterceptor = (function () {
    function CustomInterceptor() {
    }
    CustomInterceptor.prototype.intercept = function (request, next) {
        request = request.clone({
            withCredentials: true
        });
        return next.handle(request);
    };
    CustomInterceptor = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [])
    ], CustomInterceptor);
    return CustomInterceptor;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "b", function() { return environment; });
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return DND_URL; });
var environment = {
    production: true
};
var DND_URL = "http://localhost:8080/DnDPlatform/";


/***/ }),

/***/ "./src/main.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__("./node_modules/@angular/platform-browser-dynamic/esm5/platform-browser-dynamic.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__("./src/app/app.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__("./src/environments/environment.ts");




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["b" /* environment */].production) {
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* enableProdMode */])();
}
Object(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("./src/main.ts");


/***/ })

},[0]);
//# sourceMappingURL=main.bundle.js.map