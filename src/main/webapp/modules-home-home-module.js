(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["modules-home-home-module"],{

/***/ "3Clk":
/*!*****************************************************!*\
  !*** ./src/app/modules/home/home-routing.module.ts ***!
  \*****************************************************/
/*! exports provided: HomePageRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HomePageRoutingModule", function() { return HomePageRoutingModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "tyNb");
/* harmony import */ var _shared_models_enums_AppRoutesEnum__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../shared/models/enums/AppRoutesEnum */ "c6vd");
/* harmony import */ var _home_page__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./home.page */ "oUeL");
/* harmony import */ var _pages_home_main_home_main_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./pages/home-main/home-main.component */ "MpG+");






const routes = [
    {
        path: _shared_models_enums_AppRoutesEnum__WEBPACK_IMPORTED_MODULE_3__["AppRoutesEnum"].NONE,
        component: _home_page__WEBPACK_IMPORTED_MODULE_4__["HomePage"],
        children: [
            {
                path: _shared_models_enums_AppRoutesEnum__WEBPACK_IMPORTED_MODULE_3__["AppRoutesEnum"].NONE,
                redirectTo: _shared_models_enums_AppRoutesEnum__WEBPACK_IMPORTED_MODULE_3__["AppRoutesEnum"].FIND,
            },
            {
                path: _shared_models_enums_AppRoutesEnum__WEBPACK_IMPORTED_MODULE_3__["AppRoutesEnum"].FIND,
                component: _pages_home_main_home_main_component__WEBPACK_IMPORTED_MODULE_5__["HomeMainComponent"],
            },
        ],
    },
];
let HomePageRoutingModule = class HomePageRoutingModule {
};
HomePageRoutingModule = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forChild(routes)],
        exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]],
    })
], HomePageRoutingModule);



/***/ }),

/***/ "4FUw":
/*!*********************************************!*\
  !*** ./src/app/modules/home/home.page.scss ***!
  \*********************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJob21lLnBhZ2Uuc2NzcyJ9 */");

/***/ }),

/***/ "MpG+":
/*!*********************************************************************!*\
  !*** ./src/app/modules/home/pages/home-main/home-main.component.ts ***!
  \*********************************************************************/
/*! exports provided: HomeMainComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HomeMainComponent", function() { return HomeMainComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _raw_loader_home_main_component_html__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! raw-loader!./home-main.component.html */ "VwRC");
/* harmony import */ var _home_main_component_scss__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./home-main.component.scss */ "pg5s");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var src_app_modules_shared_models_classes_user_Client__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! src/app/modules/shared/models/classes/user/Client */ "StnM");
/* harmony import */ var src_app_modules_shared_models_enums_AppIconsEnum__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! src/app/modules/shared/models/enums/AppIconsEnum */ "wTr2");
/* harmony import */ var src_app_modules_shared_services_ClientService__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! src/app/modules/shared/services/ClientService */ "KrPq");







let HomeMainComponent = class HomeMainComponent {
    constructor(_clientService) {
        this._clientService = _clientService;
        this.client = new src_app_modules_shared_models_classes_user_Client__WEBPACK_IMPORTED_MODULE_4__["Client"]();
        this.notification = src_app_modules_shared_models_enums_AppIconsEnum__WEBPACK_IMPORTED_MODULE_5__["AppIconsEnum"].NOTIFICATION_ACTIVE;
        this.filteredCards = [];
        this.cards = [
            { icon: src_app_modules_shared_models_enums_AppIconsEnum__WEBPACK_IMPORTED_MODULE_5__["AppIconsEnum"].HEART, name: 'Saúde', color: 'primary' },
            { icon: src_app_modules_shared_models_enums_AppIconsEnum__WEBPACK_IMPORTED_MODULE_5__["AppIconsEnum"].AESTHETICS, name: 'Estética', color: 'primary' },
            { icon: src_app_modules_shared_models_enums_AppIconsEnum__WEBPACK_IMPORTED_MODULE_5__["AppIconsEnum"].TRAINE, name: 'Treinamento', color: 'primary' },
            { icon: src_app_modules_shared_models_enums_AppIconsEnum__WEBPACK_IMPORTED_MODULE_5__["AppIconsEnum"].NOTIFICATION, name: 'Pets', color: 'primary' },
        ];
    }
    ngOnInit() {
        this.client = this._clientService.getClient();
        this.filteredCards = this.cards;
    }
    find(value) {
        if (value) {
            this.filteredCards = this.filteredCards.filter((card) => card.name.toLowerCase().includes(value));
        }
        else {
            this.filteredCards = this.cards;
        }
    }
};
HomeMainComponent.ctorParameters = () => [
    { type: src_app_modules_shared_services_ClientService__WEBPACK_IMPORTED_MODULE_6__["ClientService"] }
];
HomeMainComponent = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-home-main',
        template: _raw_loader_home_main_component_html__WEBPACK_IMPORTED_MODULE_1__["default"],
        styles: [_home_main_component_scss__WEBPACK_IMPORTED_MODULE_2__["default"]]
    })
], HomeMainComponent);



/***/ }),

/***/ "VwRC":
/*!*************************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/home/pages/home-main/home-main.component.html ***!
  \*************************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<div>\n  <div class=\"p-1 d-flex justify-content-between\">\n    <div class=\"form-inline\">\n      <ion-avatar>\n        <img src=\"../assets/img/logo-care.jpeg\" />\n      </ion-avatar>\n      <div>\n        <ion-label class=\"\">Olá, {{ client.name }}</ion-label\n        ><br />\n        <small>Como você está?</small>\n      </div>\n    </div>\n    <div class=\"mt-4 mr-2\">\n      <app-icon\n        width=\"20px\"\n        height=\"20px\"\n        color=\"primary\"\n        [icon]=\"notification\"\n      ></app-icon>\n    </div>\n  </div>\n  <div class=\"p-2\">\n    <app-search\n      placeholder=\"Pesquise uma especialidade\"\n      class=\"mb-4\"\n      (find)=\"find($event)\"\n    ></app-search>\n    <div class=\"mt-4 row justify-content-center\">\n      <h6 class=\"col-12\"><b>Especialidades populares</b></h6>\n      <ion-card\n        *ngFor=\"let card of filteredCards\"\n        class=\"col-5 text-center\"\n        [color]=\"card.color\"\n      >\n        <ion-card-content class=\"p-4\">\n          <app-icon\n            width=\"30px\"\n            height=\"30px\"\n            color=\"light\"\n            [icon]=\"card.icon\"\n          ></app-icon>\n          <p>{{ card.name }}</p>\n        </ion-card-content>\n      </ion-card>\n    </div>\n  </div>\n</div>\n");

/***/ }),

/***/ "b0vw":
/*!***********************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/home/home.page.html ***!
  \***********************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<app-header #header></app-header>\n<ion-content>\n  <ion-router-outlet></ion-router-outlet>\n</ion-content>\n");

/***/ }),

/***/ "iydT":
/*!*********************************************!*\
  !*** ./src/app/modules/home/home.module.ts ***!
  \*********************************************/
/*! exports provided: HomePageModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HomePageModule", function() { return HomePageModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common */ "ofXK");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/forms */ "3Pt+");
/* harmony import */ var _ionic_angular__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @ionic/angular */ "TEn/");
/* harmony import */ var _home_routing_module__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./home-routing.module */ "3Clk");
/* harmony import */ var _home_page__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./home.page */ "oUeL");
/* harmony import */ var _shared_shared_module__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ../shared/shared.module */ "FpXt");
/* harmony import */ var _pages_home_main_home_main_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./pages/home-main/home-main.component */ "MpG+");









let HomePageModule = class HomePageModule {
};
HomePageModule = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        imports: [
            _angular_common__WEBPACK_IMPORTED_MODULE_2__["CommonModule"],
            _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"],
            _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["IonicModule"],
            _home_routing_module__WEBPACK_IMPORTED_MODULE_5__["HomePageRoutingModule"],
            _shared_shared_module__WEBPACK_IMPORTED_MODULE_7__["SharedModule"],
        ],
        declarations: [_home_page__WEBPACK_IMPORTED_MODULE_6__["HomePage"], _pages_home_main_home_main_component__WEBPACK_IMPORTED_MODULE_8__["HomeMainComponent"]],
    })
], HomePageModule);



/***/ }),

/***/ "oUeL":
/*!*******************************************!*\
  !*** ./src/app/modules/home/home.page.ts ***!
  \*******************************************/
/*! exports provided: HomePage */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HomePage", function() { return HomePage; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _raw_loader_home_page_html__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! raw-loader!./home.page.html */ "b0vw");
/* harmony import */ var _home_page_scss__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./home.page.scss */ "4FUw");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _shared_models_classes_util_Header__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../shared/models/classes/util/Header */ "dJmN");
/* harmony import */ var _shared_services_HeaderService__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../shared/services/HeaderService */ "0JUh");






let HomePage = class HomePage {
    constructor(_headerService) {
        this._headerService = _headerService;
    }
    ngOnInit() { }
    ngAfterViewChecked() {
        this._setHeader();
    }
    _setHeader() {
        let header = new _shared_models_classes_util_Header__WEBPACK_IMPORTED_MODULE_4__["Header"]().builder().build();
        this._headerService.setHeader(header);
    }
    goBack() {
        console.log('voltar');
    }
};
HomePage.ctorParameters = () => [
    { type: _shared_services_HeaderService__WEBPACK_IMPORTED_MODULE_5__["HeaderService"] }
];
HomePage = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-home',
        template: _raw_loader_home_page_html__WEBPACK_IMPORTED_MODULE_1__["default"],
        styles: [_home_page_scss__WEBPACK_IMPORTED_MODULE_2__["default"]]
    })
], HomePage);



/***/ }),

/***/ "pg5s":
/*!***********************************************************************!*\
  !*** ./src/app/modules/home/pages/home-main/home-main.component.scss ***!
  \***********************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("ion-avatar {\n  height: 90px;\n  width: 90px;\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIi4uLy4uLy4uLy4uLy4uLy4uL2hvbWUtbWFpbi5jb21wb25lbnQuc2NzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtFQUNFLFlBQUE7RUFDQSxXQUFBO0FBQ0YiLCJmaWxlIjoiaG9tZS1tYWluLmNvbXBvbmVudC5zY3NzIiwic291cmNlc0NvbnRlbnQiOlsiaW9uLWF2YXRhciB7XG4gIGhlaWdodDogOTBweDtcbiAgd2lkdGg6IDkwcHg7XG59XG4iXX0= */");

/***/ })

}]);
//# sourceMappingURL=modules-home-home-module.js.map