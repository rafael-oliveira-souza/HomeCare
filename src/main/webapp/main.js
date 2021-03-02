(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "+YtH":
/*!************************************************************************!*\
  !*** ./src/app/modules/shared/components/icons/icon/icon.component.ts ***!
  \************************************************************************/
/*! exports provided: IconComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "IconComponent", function() { return IconComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _raw_loader_icon_component_html__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! raw-loader!./icon.component.html */ "D55+");
/* harmony import */ var _icon_component_scss__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./icon.component.scss */ "j7Py");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "fXoL");




let IconComponent = class IconComponent {
    constructor() {
        this.color = '';
        this.height = '15px';
        this.width = '15px';
        this.stilez = {};
    }
    ngOnInit() {
        //verificar se a cor enviada é uma cor valida ou uma variavel no sistema de variaveis de cores.
        if (!this.color.includes('#')) {
            this.color = 'var(--' + this.color + ')';
        }
    }
};
IconComponent.ctorParameters = () => [];
IconComponent.propDecorators = {
    icon: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['icon',] }],
    color: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['color',] }],
    height: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['height',] }],
    width: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['width',] }]
};
IconComponent = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-icon',
        template: _raw_loader_icon_component_html__WEBPACK_IMPORTED_MODULE_1__["default"],
        styles: [_icon_component_scss__WEBPACK_IMPORTED_MODULE_2__["default"]]
    })
], IconComponent);



/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! /Users/rafael-souza/Documents/projetos-pessoais/Ubecare/front/ubecare/src/main.ts */"zUnb");


/***/ }),

/***/ "0JUh":
/*!**********************************************************!*\
  !*** ./src/app/modules/shared/services/HeaderService.ts ***!
  \**********************************************************/
/*! exports provided: HeaderService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HeaderService", function() { return HeaderService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! rxjs */ "qCKp");



let HeaderService = class HeaderService {
    constructor() {
        this.objectSource = new rxjs__WEBPACK_IMPORTED_MODULE_2__["BehaviorSubject"](this.object);
        this.observableObject = this.objectSource.asObservable();
    }
    setHeader(obj) {
        this.objectSource.next(obj);
    }
    getHeader() {
        return this.observableObject;
    }
    eraseHeader() {
        this.objectSource.next(null);
    }
};
HeaderService.ctorParameters = () => [];
HeaderService = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
        providedIn: 'root',
    })
], HeaderService);



/***/ }),

/***/ "7yfn":
/*!**************************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/shared/components/header/header.component.html ***!
  \**************************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<ion-header [translucent]=\"false\" *ngIf=\"dataHeader\">\n  <ion-toolbar [color]=\"dataHeader.color\">\n    <ion-buttons slot=\"start\" *ngIf=\"dataHeader.goBack\" class=\"p-2\">\n      <app-icon icon=\"angle-left\" (click)=\"dataHeader.goBack()\"></app-icon>\n    </ion-buttons>\n    <ion-buttons slot=\"end\" class=\"form-inline\" class=\"p-2\">\n      <app-icon\n        *ngIf=\"dataHeader.firstIcon && dataHeader.firstIcon.show\"\n        [icon]=\"dataHeader.firstIcon.name\"\n        (click)=\"activeCallback(dataHeader.firstIcon.callback)\"\n      ></app-icon>\n      <app-icon\n        *ngIf=\"dataHeader.secondIcon && dataHeader.secondIcon.show\"\n        [icon]=\"dataHeader.secondIcon.name\"\n        (click)=\"activeCallback(dataHeader.secondIcon.callback)\"\n      ></app-icon>\n      <ion-menu-button *ngIf=\"dataHeader.showMenuIcon\"></ion-menu-button>\n    </ion-buttons>\n    <ion-title>{{ dataHeader.title }}</ion-title>\n  </ion-toolbar>\n</ion-header>\n");

/***/ }),

/***/ "84Fk":
/*!****************************************************************************!*\
  !*** ./src/app/modules/shared/components/text-msg/text-msg.component.scss ***!
  \****************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("/** Ionic CSS Variables **/\n:root {\n  --primary: #005ca9;\n  --primary-strong: #1047df;\n  --primary-weak: #004c8c;\n  --secondary: #3dc2ff;\n  --secondary-strong: #36abe0;\n  --secondary-weak: #50c8ff;\n  --light: #ffffff;\n  --light-strong: #ffffff;\n  --light-weak: #f3f5f9;\n  --danger: #eb445a;\n  --danger-strong: #cf3c4f;\n  --danger-weak: #ed576b;\n  --gray: #92949c;\n  --gray-strong: #808289;\n  --gray-weak: #9d9fa6;\n  /** tertiary **/\n  --violet: #5260ff;\n  --violet-strong: #4854e0;\n  --violet-weak: #6370ff;\n  /** success **/\n  --success: #2dd36f;\n  --success-shade: #28ba62;\n  --success-tint: #42d77d;\n  /** warning **/\n  --warning: #ffc409;\n  --warning-shade: #e0ac08;\n  --warning-tint: #ffca22;\n  --alert: #e9e51d;\n  --alert-shade: #cac70f;\n  --alert-tint: #f5f258;\n  --text: #1f3033;\n  --dark: #1f3033;\n  --gradient-main: linear-gradient(to top, #005bea, #00c6fb 100%);\n  --gradient-primary: linear-gradient(to right, #4facfe, #00f2fe);\n  --gradient-header: linear-gradient(251.13deg, #00a2cd 24.32%, #0066a6 79.58%);\n  --ion-color-alert: var(--alert);\n  --ion-color-alert-rgb: 56, 128, 255;\n  --ion-color-alert-contrast: var(--light);\n  --ion-color-alert-contrast-rgb: 255, 255, 255;\n  --ion-color-alert-shade: var(--alert-strong);\n  --ion-color-alert-tint: var(--alert-weak);\n  /** primary **/\n  --ion-color-primary: var(--primary);\n  --ion-color-primary-rgb: 56, 128, 255;\n  --ion-color-primary-contrast: var(--light);\n  --ion-color-primary-contrast-rgb: 255, 255, 255;\n  --ion-color-primary-shade: var(--primary-strong);\n  --ion-color-primary-tint: var(--primary-weak);\n  /** secondary **/\n  --ion-color-secondary: var(--secondary);\n  --ion-color-secondary-rgb: 61, 194, 255;\n  --ion-color-secondary-contrast: var(--light);\n  --ion-color-secondary-contrast-rgb: 255, 255, 255;\n  --ion-color-secondary-shade: var(--secondary-strong);\n  --ion-color-secondary-tint: var(--secondary-weak);\n  /** tertiary **/\n  --ion-color-tertiary: var(--violet);\n  --ion-color-tertiary-rgb: 82, 96, 255;\n  --ion-color-tertiary-contrast: var(--light);\n  --ion-color-tertiary-contrast-rgb: 255, 255, 255;\n  --ion-color-tertiary-shade: var(--violet-strong);\n  --ion-color-tertiary-tint: var(--violet-weak);\n  /** success **/\n  --ion-color-success: var(--success);\n  --ion-color-success-rgb: 45, 211, 111;\n  --ion-color-success-contrast: var(--light);\n  --ion-color-success-contrast-rgb: 255, 255, 255;\n  --ion-color-success-shade: var(--success-strong);\n  --ion-color-success-tint: var(--success-weak);\n  /** warning **/\n  --ion-color-warning: var(--warning);\n  --ion-color-warning-rgb: 255, 196, 9;\n  --ion-color-warning-contrast: var(--dark);\n  --ion-color-warning-contrast-rgb: 0, 0, 0;\n  --ion-color-warning-shade: var(--warning-strong);\n  --ion-color-warning-tint: var(--warning-weak);\n  /** danger **/\n  --ion-color-danger: var(--red);\n  --ion-color-danger-rgb: 235, 68, 90;\n  --ion-color-danger-contrast: var(--light);\n  --ion-color-danger-contrast-rgb: 255, 255, 255;\n  --ion-color-danger-shade: var(--red-strong);\n  --ion-color-danger-tint: var(--red-weak);\n  /** dark **/\n  --ion-color-dark: var(--dark);\n  --ion-color-dark-rgb: 34, 36, 40;\n  --ion-color-dark-contrast: var(--light);\n  --ion-color-dark-contrast-rgb: 255, 255, 255;\n  --ion-color-dark-shade: var(--dark);\n  --ion-color-dark-tint: var(--dark);\n  /** medium **/\n  --ion-color-medium: var(--gray);\n  --ion-color-medium-rgb: 146, 148, 156;\n  --ion-color-medium-contrast: var(--light);\n  --ion-color-medium-contrast-rgb: 255, 255, 255;\n  --ion-color-medium-shade: var(--gray-strong);\n  --ion-color-medium-tint: var(--gray-weak);\n  /** light **/\n  --ion-color-light: var(--light);\n  --ion-color-light-rgb: 244, 245, 248;\n  --ion-color-light-contrast: var(--dark);\n  --ion-color-light-contrast-rgb: 0, 0, 0;\n  --ion-color-light-shade: var(--light-strong);\n  --ion-color-light-tint: var(--light-weak);\n}\n.success {\n  color: var(--success);\n}\n.warning {\n  color: var(--warning);\n}\n.danger {\n  color: var(--danger);\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIi4uLy4uLy4uLy4uLy4uLy4uLy4uLy4uLy4uLy4uLy4uL3RoZW1lL3ZhcmlhYmxlcy5zY3NzIiwiLi4vLi4vLi4vLi4vLi4vLi4vdGV4dC1tc2cuY29tcG9uZW50LnNjc3MiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IkFBR0EsMEJBQUE7QUFnQkE7RUFDRSxrQkFBQTtFQUNBLHlCQUFBO0VBQ0EsdUJBQUE7RUFFQSxvQkFBQTtFQUNBLDJCQUFBO0VBQ0EseUJBQUE7RUFFQSxnQkFBQTtFQUNBLHVCQUFBO0VBQ0EscUJBQUE7RUFFQSxpQkFBQTtFQUNBLHdCQUFBO0VBQ0Esc0JBQUE7RUFFQSxlQUFBO0VBQ0Esc0JBQUE7RUFDQSxvQkFBQTtFQUVBLGVBQUE7RUFDQSxpQkFBQTtFQUNBLHdCQUFBO0VBQ0Esc0JBQUE7RUFFQSxjQUFBO0VBQ0Esa0JBQUE7RUFDQSx3QkFBQTtFQUNBLHVCQUFBO0VBRUEsY0FBQTtFQUNBLGtCQUFBO0VBQ0Esd0JBQUE7RUFDQSx1QkFBQTtFQUVBLGdCQUFBO0VBQ0Esc0JBQUE7RUFDQSxxQkFBQTtFQUVBLGVBQUE7RUFDQSxlQUFBO0VBSUEsK0RBQUE7RUFDQSwrREFBQTtFQUNBLDZFQUFBO0VBRUEsK0JBQUE7RUFDQSxtQ0FBQTtFQUNBLHdDQUFBO0VBQ0EsNkNBQUE7RUFDQSw0Q0FBQTtFQUNBLHlDQUFBO0VBRUEsY0FBQTtFQUNBLG1DQUFBO0VBQ0EscUNBQUE7RUFDQSwwQ0FBQTtFQUNBLCtDQUFBO0VBQ0EsZ0RBQUE7RUFDQSw2Q0FBQTtFQUVBLGdCQUFBO0VBQ0EsdUNBQUE7RUFDQSx1Q0FBQTtFQUNBLDRDQUFBO0VBQ0EsaURBQUE7RUFDQSxvREFBQTtFQUNBLGlEQUFBO0VBRUEsZUFBQTtFQUNBLG1DQUFBO0VBQ0EscUNBQUE7RUFDQSwyQ0FBQTtFQUNBLGdEQUFBO0VBQ0EsZ0RBQUE7RUFDQSw2Q0FBQTtFQUVBLGNBQUE7RUFDQSxtQ0FBQTtFQUNBLHFDQUFBO0VBQ0EsMENBQUE7RUFDQSwrQ0FBQTtFQUNBLGdEQUFBO0VBQ0EsNkNBQUE7RUFFQSxjQUFBO0VBQ0EsbUNBQUE7RUFDQSxvQ0FBQTtFQUNBLHlDQUFBO0VBQ0EseUNBQUE7RUFDQSxnREFBQTtFQUNBLDZDQUFBO0VBRUEsYUFBQTtFQUNBLDhCQUFBO0VBQ0EsbUNBQUE7RUFDQSx5Q0FBQTtFQUNBLDhDQUFBO0VBQ0EsMkNBQUE7RUFDQSx3Q0FBQTtFQUVBLFdBQUE7RUFDQSw2QkFBQTtFQUNBLGdDQUFBO0VBQ0EsdUNBQUE7RUFDQSw0Q0FBQTtFQUNBLG1DQUFBO0VBQ0Esa0NBQUE7RUFFQSxhQUFBO0VBQ0EsK0JBQUE7RUFDQSxxQ0FBQTtFQUNBLHlDQUFBO0VBQ0EsOENBQUE7RUFDQSw0Q0FBQTtFQUNBLHlDQUFBO0VBRUEsWUFBQTtFQUNBLCtCQUFBO0VBQ0Esb0NBQUE7RUFDQSx1Q0FBQTtFQUNBLHVDQUFBO0VBQ0EsNENBQUE7RUFDQSx5Q0FBQTtBQ3ZDRjtBQXhHQTtFQUNFLHFCQUFBO0FBMkdGO0FBekdBO0VBQ0UscUJBQUE7QUE0R0Y7QUExR0E7RUFDRSxvQkFBQTtBQTZHRiIsImZpbGUiOiJ0ZXh0LW1zZy5jb21wb25lbnQuc2NzcyIsInNvdXJjZXNDb250ZW50IjpbIi8vIElvbmljIFZhcmlhYmxlcyBhbmQgVGhlbWluZy4gRm9yIG1vcmUgaW5mbywgcGxlYXNlIHNlZTpcbi8vIGh0dHA6Ly9pb25pY2ZyYW1ld29yay5jb20vZG9jcy90aGVtaW5nL1xuXG4vKiogSW9uaWMgQ1NTIFZhcmlhYmxlcyAqKi9cbi8vIENPUkVTIFBSSU5DSVBBSVNcblxuJGNvbG9yczogKFxuICBwcmltYXJ5OiAjMDA1Y2E5LFxuICBzZWNvbmRhcnk6ICMzZGMyZmYsXG4gIGRhbmdlcjogI2ViNDQ1YSxcbiAgbGlnaHQ6ICNmZmZmZmYsXG4gIGRhcms6ICMxZjMwMzMsXG4gIHN1Y2Nlc3M6ICMyZGQzNmYsXG4gIHdhcm5uaW5nOiAjZmZjNDA5LFxuICB2aW9sZXQ6ICM1MjYwZmYsXG4gIGdyYXk6ICM5Mjk0OWMsXG4gIGFsZXJ0OiAjZTllNTFkLFxuKTtcblxuOnJvb3Qge1xuICAtLXByaW1hcnk6ICMwMDVjYTk7XG4gIC0tcHJpbWFyeS1zdHJvbmc6ICMxMDQ3ZGY7XG4gIC0tcHJpbWFyeS13ZWFrOiAjMDA0YzhjO1xuXG4gIC0tc2Vjb25kYXJ5OiAjM2RjMmZmO1xuICAtLXNlY29uZGFyeS1zdHJvbmc6ICMzNmFiZTA7XG4gIC0tc2Vjb25kYXJ5LXdlYWs6ICM1MGM4ZmY7XG5cbiAgLS1saWdodDogI2ZmZmZmZjtcbiAgLS1saWdodC1zdHJvbmc6ICNmZmZmZmY7XG4gIC0tbGlnaHQtd2VhazogI2YzZjVmOTtcblxuICAtLWRhbmdlcjogI2ViNDQ1YTtcbiAgLS1kYW5nZXItc3Ryb25nOiAjY2YzYzRmO1xuICAtLWRhbmdlci13ZWFrOiAjZWQ1NzZiO1xuXG4gIC0tZ3JheTogIzkyOTQ5YztcbiAgLS1ncmF5LXN0cm9uZzogIzgwODI4OTtcbiAgLS1ncmF5LXdlYWs6ICM5ZDlmYTY7XG5cbiAgLyoqIHRlcnRpYXJ5ICoqL1xuICAtLXZpb2xldDogIzUyNjBmZjtcbiAgLS12aW9sZXQtc3Ryb25nOiAjNDg1NGUwO1xuICAtLXZpb2xldC13ZWFrOiAjNjM3MGZmO1xuXG4gIC8qKiBzdWNjZXNzICoqL1xuICAtLXN1Y2Nlc3M6ICMyZGQzNmY7XG4gIC0tc3VjY2Vzcy1zaGFkZTogIzI4YmE2MjtcbiAgLS1zdWNjZXNzLXRpbnQ6ICM0MmQ3N2Q7XG5cbiAgLyoqIHdhcm5pbmcgKiovXG4gIC0td2FybmluZzogI2ZmYzQwOTtcbiAgLS13YXJuaW5nLXNoYWRlOiAjZTBhYzA4O1xuICAtLXdhcm5pbmctdGludDogI2ZmY2EyMjtcblxuICAtLWFsZXJ0OiAjZTllNTFkO1xuICAtLWFsZXJ0LXNoYWRlOiAjY2FjNzBmO1xuICAtLWFsZXJ0LXRpbnQ6ICNmNWYyNTg7XG5cbiAgLS10ZXh0OiAjMWYzMDMzO1xuICAtLWRhcms6ICMxZjMwMzM7XG5cbiAgLy8gR1JBRElFTlRFUyAvKiBXM0MsIElFMTArLCBGRjE2KywgQ2hyb21lMjYrLCBPcGVyYTEyKywgU2FmYXJpNysgKi9cblxuICAtLWdyYWRpZW50LW1haW46IGxpbmVhci1ncmFkaWVudCh0byB0b3AsICMwMDViZWEsICMwMGM2ZmIgMTAwJSk7XG4gIC0tZ3JhZGllbnQtcHJpbWFyeTogbGluZWFyLWdyYWRpZW50KHRvIHJpZ2h0LCAjNGZhY2ZlLCAjMDBmMmZlKTtcbiAgLS1ncmFkaWVudC1oZWFkZXI6IGxpbmVhci1ncmFkaWVudCgyNTEuMTNkZWcsICMwMGEyY2QgMjQuMzIlLCAjMDA2NmE2IDc5LjU4JSk7XG5cbiAgLS1pb24tY29sb3ItYWxlcnQ6IHZhcigtLWFsZXJ0KTtcbiAgLS1pb24tY29sb3ItYWxlcnQtcmdiOiA1NiwgMTI4LCAyNTU7XG4gIC0taW9uLWNvbG9yLWFsZXJ0LWNvbnRyYXN0OiB2YXIoLS1saWdodCk7XG4gIC0taW9uLWNvbG9yLWFsZXJ0LWNvbnRyYXN0LXJnYjogMjU1LCAyNTUsIDI1NTtcbiAgLS1pb24tY29sb3ItYWxlcnQtc2hhZGU6IHZhcigtLWFsZXJ0LXN0cm9uZyk7XG4gIC0taW9uLWNvbG9yLWFsZXJ0LXRpbnQ6IHZhcigtLWFsZXJ0LXdlYWspO1xuXG4gIC8qKiBwcmltYXJ5ICoqL1xuICAtLWlvbi1jb2xvci1wcmltYXJ5OiB2YXIoLS1wcmltYXJ5KTtcbiAgLS1pb24tY29sb3ItcHJpbWFyeS1yZ2I6IDU2LCAxMjgsIDI1NTtcbiAgLS1pb24tY29sb3ItcHJpbWFyeS1jb250cmFzdDogdmFyKC0tbGlnaHQpO1xuICAtLWlvbi1jb2xvci1wcmltYXJ5LWNvbnRyYXN0LXJnYjogMjU1LCAyNTUsIDI1NTtcbiAgLS1pb24tY29sb3ItcHJpbWFyeS1zaGFkZTogdmFyKC0tcHJpbWFyeS1zdHJvbmcpO1xuICAtLWlvbi1jb2xvci1wcmltYXJ5LXRpbnQ6IHZhcigtLXByaW1hcnktd2Vhayk7XG5cbiAgLyoqIHNlY29uZGFyeSAqKi9cbiAgLS1pb24tY29sb3Itc2Vjb25kYXJ5OiB2YXIoLS1zZWNvbmRhcnkpO1xuICAtLWlvbi1jb2xvci1zZWNvbmRhcnktcmdiOiA2MSwgMTk0LCAyNTU7XG4gIC0taW9uLWNvbG9yLXNlY29uZGFyeS1jb250cmFzdDogdmFyKC0tbGlnaHQpO1xuICAtLWlvbi1jb2xvci1zZWNvbmRhcnktY29udHJhc3QtcmdiOiAyNTUsIDI1NSwgMjU1O1xuICAtLWlvbi1jb2xvci1zZWNvbmRhcnktc2hhZGU6IHZhcigtLXNlY29uZGFyeS1zdHJvbmcpO1xuICAtLWlvbi1jb2xvci1zZWNvbmRhcnktdGludDogdmFyKC0tc2Vjb25kYXJ5LXdlYWspO1xuXG4gIC8qKiB0ZXJ0aWFyeSAqKi9cbiAgLS1pb24tY29sb3ItdGVydGlhcnk6IHZhcigtLXZpb2xldCk7XG4gIC0taW9uLWNvbG9yLXRlcnRpYXJ5LXJnYjogODIsIDk2LCAyNTU7XG4gIC0taW9uLWNvbG9yLXRlcnRpYXJ5LWNvbnRyYXN0OiB2YXIoLS1saWdodCk7XG4gIC0taW9uLWNvbG9yLXRlcnRpYXJ5LWNvbnRyYXN0LXJnYjogMjU1LCAyNTUsIDI1NTtcbiAgLS1pb24tY29sb3ItdGVydGlhcnktc2hhZGU6IHZhcigtLXZpb2xldC1zdHJvbmcpO1xuICAtLWlvbi1jb2xvci10ZXJ0aWFyeS10aW50OiB2YXIoLS12aW9sZXQtd2Vhayk7XG5cbiAgLyoqIHN1Y2Nlc3MgKiovXG4gIC0taW9uLWNvbG9yLXN1Y2Nlc3M6IHZhcigtLXN1Y2Nlc3MpO1xuICAtLWlvbi1jb2xvci1zdWNjZXNzLXJnYjogNDUsIDIxMSwgMTExO1xuICAtLWlvbi1jb2xvci1zdWNjZXNzLWNvbnRyYXN0OiB2YXIoLS1saWdodCk7XG4gIC0taW9uLWNvbG9yLXN1Y2Nlc3MtY29udHJhc3QtcmdiOiAyNTUsIDI1NSwgMjU1O1xuICAtLWlvbi1jb2xvci1zdWNjZXNzLXNoYWRlOiB2YXIoLS1zdWNjZXNzLXN0cm9uZyk7XG4gIC0taW9uLWNvbG9yLXN1Y2Nlc3MtdGludDogdmFyKC0tc3VjY2Vzcy13ZWFrKTtcblxuICAvKiogd2FybmluZyAqKi9cbiAgLS1pb24tY29sb3Itd2FybmluZzogdmFyKC0td2FybmluZyk7XG4gIC0taW9uLWNvbG9yLXdhcm5pbmctcmdiOiAyNTUsIDE5NiwgOTtcbiAgLS1pb24tY29sb3Itd2FybmluZy1jb250cmFzdDogdmFyKC0tZGFyayk7XG4gIC0taW9uLWNvbG9yLXdhcm5pbmctY29udHJhc3QtcmdiOiAwLCAwLCAwO1xuICAtLWlvbi1jb2xvci13YXJuaW5nLXNoYWRlOiB2YXIoLS13YXJuaW5nLXN0cm9uZyk7XG4gIC0taW9uLWNvbG9yLXdhcm5pbmctdGludDogdmFyKC0td2FybmluZy13ZWFrKTtcblxuICAvKiogZGFuZ2VyICoqL1xuICAtLWlvbi1jb2xvci1kYW5nZXI6IHZhcigtLXJlZCk7XG4gIC0taW9uLWNvbG9yLWRhbmdlci1yZ2I6IDIzNSwgNjgsIDkwO1xuICAtLWlvbi1jb2xvci1kYW5nZXItY29udHJhc3Q6IHZhcigtLWxpZ2h0KTtcbiAgLS1pb24tY29sb3ItZGFuZ2VyLWNvbnRyYXN0LXJnYjogMjU1LCAyNTUsIDI1NTtcbiAgLS1pb24tY29sb3ItZGFuZ2VyLXNoYWRlOiB2YXIoLS1yZWQtc3Ryb25nKTtcbiAgLS1pb24tY29sb3ItZGFuZ2VyLXRpbnQ6IHZhcigtLXJlZC13ZWFrKTtcblxuICAvKiogZGFyayAqKi9cbiAgLS1pb24tY29sb3ItZGFyazogdmFyKC0tZGFyayk7XG4gIC0taW9uLWNvbG9yLWRhcmstcmdiOiAzNCwgMzYsIDQwO1xuICAtLWlvbi1jb2xvci1kYXJrLWNvbnRyYXN0OiB2YXIoLS1saWdodCk7XG4gIC0taW9uLWNvbG9yLWRhcmstY29udHJhc3QtcmdiOiAyNTUsIDI1NSwgMjU1O1xuICAtLWlvbi1jb2xvci1kYXJrLXNoYWRlOiB2YXIoLS1kYXJrKTtcbiAgLS1pb24tY29sb3ItZGFyay10aW50OiB2YXIoLS1kYXJrKTtcblxuICAvKiogbWVkaXVtICoqL1xuICAtLWlvbi1jb2xvci1tZWRpdW06IHZhcigtLWdyYXkpO1xuICAtLWlvbi1jb2xvci1tZWRpdW0tcmdiOiAxNDYsIDE0OCwgMTU2O1xuICAtLWlvbi1jb2xvci1tZWRpdW0tY29udHJhc3Q6IHZhcigtLWxpZ2h0KTtcbiAgLS1pb24tY29sb3ItbWVkaXVtLWNvbnRyYXN0LXJnYjogMjU1LCAyNTUsIDI1NTtcbiAgLS1pb24tY29sb3ItbWVkaXVtLXNoYWRlOiB2YXIoLS1ncmF5LXN0cm9uZyk7XG4gIC0taW9uLWNvbG9yLW1lZGl1bS10aW50OiB2YXIoLS1ncmF5LXdlYWspO1xuXG4gIC8qKiBsaWdodCAqKi9cbiAgLS1pb24tY29sb3ItbGlnaHQ6IHZhcigtLWxpZ2h0KTtcbiAgLS1pb24tY29sb3ItbGlnaHQtcmdiOiAyNDQsIDI0NSwgMjQ4O1xuICAtLWlvbi1jb2xvci1saWdodC1jb250cmFzdDogdmFyKC0tZGFyayk7XG4gIC0taW9uLWNvbG9yLWxpZ2h0LWNvbnRyYXN0LXJnYjogMCwgMCwgMDtcbiAgLS1pb24tY29sb3ItbGlnaHQtc2hhZGU6IHZhcigtLWxpZ2h0LXN0cm9uZyk7XG4gIC0taW9uLWNvbG9yLWxpZ2h0LXRpbnQ6IHZhcigtLWxpZ2h0LXdlYWspO1xufVxuIiwiQGltcG9ydCBcIi4uLy4uLy4uLy4uLy4uL3RoZW1lL3ZhcmlhYmxlcy5zY3NzXCI7XG5cbi5zdWNjZXNzIHtcbiAgY29sb3I6IHZhcigtLXN1Y2Nlc3MpO1xufVxuLndhcm5pbmcge1xuICBjb2xvcjogdmFyKC0td2FybmluZyk7XG59XG4uZGFuZ2VyIHtcbiAgY29sb3I6IHZhcigtLWRhbmdlcik7XG59XG4iXX0= */");

/***/ }),

/***/ "8ulg":
/*!**********************************************************************************!*\
  !*** ./src/app/modules/shared/components/icons/svg-icon/svg-icon.component.scss ***!
  \**********************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzdmctaWNvbi5jb21wb25lbnQuc2NzcyJ9 */");

/***/ }),

/***/ "9BkZ":
/*!****************************************************************!*\
  !*** ./src/app/modules/shared/components/img/img.component.ts ***!
  \****************************************************************/
/*! exports provided: ImgComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ImgComponent", function() { return ImgComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _raw_loader_img_component_html__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! raw-loader!./img.component.html */ "cWNS");
/* harmony import */ var _img_component_scss__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./img.component.scss */ "vkP1");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "fXoL");




let ImgComponent = class ImgComponent {
    constructor() {
        this.circular = false;
        this.width = 60;
        this.height = 60;
        this.clazz = '';
    }
    ngOnInit() {
        if (this.align) {
            this.clazz = `text-${this.align}`;
        }
        if (this.circular) {
            this.clazz = this.clazz + ` rounded-circle`;
        }
    }
};
ImgComponent.ctorParameters = () => [];
ImgComponent.propDecorators = {
    source: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['source',] }],
    align: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['align',] }],
    circular: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['circular',] }],
    width: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['width',] }],
    height: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['height',] }]
};
ImgComponent = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-img',
        template: _raw_loader_img_component_html__WEBPACK_IMPORTED_MODULE_1__["default"],
        styles: [_img_component_scss__WEBPACK_IMPORTED_MODULE_2__["default"]]
    })
], ImgComponent);



/***/ }),

/***/ "9hfv":
/*!***************************************************************!*\
  !*** ./src/app/modules/shared/models/enums/AppGendersEnum.ts ***!
  \***************************************************************/
/*! exports provided: AppGendersEnum */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppGendersEnum", function() { return AppGendersEnum; });
var AppGendersEnum;
(function (AppGendersEnum) {
    AppGendersEnum["MALE"] = "M";
    AppGendersEnum["FEMALE"] = "F";
})(AppGendersEnum || (AppGendersEnum = {}));


/***/ }),

/***/ "AytR":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
const environment = {
    nameApp: 'Ubecare',
    production: false,
};
/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "D55+":
/*!****************************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/shared/components/icons/icon/icon.component.html ***!
  \****************************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<app-icon-map></app-icon-map>\n<app-svg-icon\n  [id]=\"icon\"\n  [width]=\"width\"\n  [height]=\"height\"\n  [color]=\"color\"\n></app-svg-icon>\n");

/***/ }),

/***/ "F8Sv":
/*!**********************************************************************!*\
  !*** ./src/app/modules/shared/components/header/header.component.ts ***!
  \**********************************************************************/
/*! exports provided: HeaderComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HeaderComponent", function() { return HeaderComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _raw_loader_header_component_html__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! raw-loader!./header.component.html */ "7yfn");
/* harmony import */ var _header_component_scss__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./header.component.scss */ "eVpS");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var src_environments_environment__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! src/environments/environment */ "AytR");
/* harmony import */ var _services_HeaderService__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../../services/HeaderService */ "0JUh");






let HeaderComponent = class HeaderComponent {
    constructor(_headerService) {
        this._headerService = _headerService;
        this.dataHeader = null;
    }
    ngOnInit() {
        this._headerService.getHeader().subscribe((dataHeader) => {
            this.dataHeader = dataHeader;
            if (this.dataHeader && !this.dataHeader.title) {
                this.dataHeader.title = src_environments_environment__WEBPACK_IMPORTED_MODULE_4__["environment"].nameApp;
            }
        });
    }
    activeCallback(item) {
        if (item && item.callback) {
            item.callback();
        }
    }
};
HeaderComponent.ctorParameters = () => [
    { type: _services_HeaderService__WEBPACK_IMPORTED_MODULE_5__["HeaderService"] }
];
HeaderComponent = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-header',
        template: _raw_loader_header_component_html__WEBPACK_IMPORTED_MODULE_1__["default"],
        styles: [_header_component_scss__WEBPACK_IMPORTED_MODULE_2__["default"]]
    })
], HeaderComponent);



/***/ }),

/***/ "FpXt":
/*!*************************************************!*\
  !*** ./src/app/modules/shared/shared.module.ts ***!
  \*************************************************/
/*! exports provided: SharedModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SharedModule", function() { return SharedModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/common */ "ofXK");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/forms */ "3Pt+");
/* harmony import */ var _ionic_angular__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @ionic/angular */ "TEn/");
/* harmony import */ var _components_footer_footer_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./components/footer/footer.component */ "TnyQ");
/* harmony import */ var _components_img_img_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./components/img/img.component */ "9BkZ");
/* harmony import */ var _components_input_input_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./components/input/input.component */ "iC0x");
/* harmony import */ var br_mask__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! br-mask */ "mzEM");
/* harmony import */ var _components_text_msg_text_msg_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./components/text-msg/text-msg.component */ "wB1E");
/* harmony import */ var _shared_routing_module__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./shared-routing.module */ "sxQk");
/* harmony import */ var _components_header_header_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./components/header/header.component */ "F8Sv");
/* harmony import */ var _components_search_search_component__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./components/search/search.component */ "iO1G");
/* harmony import */ var _components_icons_icon_map_icon_map_component__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ./components/icons/icon-map/icon-map.component */ "kImk");
/* harmony import */ var _components_icons_icon_icon_component__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! ./components/icons/icon/icon.component */ "+YtH");
/* harmony import */ var _components_icons_svg_icon_svg_icon_component__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! ./components/icons/svg-icon/svg-icon.component */ "g0gg");
















let SharedModule = class SharedModule {
};
SharedModule = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        imports: [
            _angular_common__WEBPACK_IMPORTED_MODULE_2__["CommonModule"],
            _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"],
            _angular_forms__WEBPACK_IMPORTED_MODULE_3__["ReactiveFormsModule"],
            _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["IonicModule"],
            br_mask__WEBPACK_IMPORTED_MODULE_8__["BrMaskerModule"],
            _shared_routing_module__WEBPACK_IMPORTED_MODULE_10__["SharedPageRoutingModule"],
        ],
        declarations: [
            //components
            _components_icons_icon_icon_component__WEBPACK_IMPORTED_MODULE_14__["IconComponent"],
            _components_icons_icon_map_icon_map_component__WEBPACK_IMPORTED_MODULE_13__["IconMapComponent"],
            _components_icons_svg_icon_svg_icon_component__WEBPACK_IMPORTED_MODULE_15__["SvgIconComponent"],
            _components_img_img_component__WEBPACK_IMPORTED_MODULE_6__["ImgComponent"],
            _components_input_input_component__WEBPACK_IMPORTED_MODULE_7__["InputComponent"],
            _components_footer_footer_component__WEBPACK_IMPORTED_MODULE_5__["FooterComponent"],
            _components_text_msg_text_msg_component__WEBPACK_IMPORTED_MODULE_9__["TextMsgComponent"],
            _components_header_header_component__WEBPACK_IMPORTED_MODULE_11__["HeaderComponent"],
            _components_search_search_component__WEBPACK_IMPORTED_MODULE_12__["SearchComponent"],
        ],
        exports: [
            _angular_forms__WEBPACK_IMPORTED_MODULE_3__["FormsModule"],
            _angular_forms__WEBPACK_IMPORTED_MODULE_3__["ReactiveFormsModule"],
            //components
            _components_icons_icon_icon_component__WEBPACK_IMPORTED_MODULE_14__["IconComponent"],
            _components_icons_icon_map_icon_map_component__WEBPACK_IMPORTED_MODULE_13__["IconMapComponent"],
            _components_icons_svg_icon_svg_icon_component__WEBPACK_IMPORTED_MODULE_15__["SvgIconComponent"],
            _components_img_img_component__WEBPACK_IMPORTED_MODULE_6__["ImgComponent"],
            _components_input_input_component__WEBPACK_IMPORTED_MODULE_7__["InputComponent"],
            _components_footer_footer_component__WEBPACK_IMPORTED_MODULE_5__["FooterComponent"],
            _components_text_msg_text_msg_component__WEBPACK_IMPORTED_MODULE_9__["TextMsgComponent"],
            _components_header_header_component__WEBPACK_IMPORTED_MODULE_11__["HeaderComponent"],
            _components_search_search_component__WEBPACK_IMPORTED_MODULE_12__["SearchComponent"],
        ],
    })
], SharedModule);



/***/ }),

/***/ "G3Xc":
/*!**************************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/shared/components/footer/footer.component.html ***!
  \**************************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<div [ngStyle]=\"stylez\" [ngClass]=\"clazz\">\n  <ng-content ></ng-content>\n</div>\n");

/***/ }),

/***/ "HU6n":
/*!************************************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/shared/components/icons/svg-icon/svg-icon.component.html ***!
  \************************************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<svg #svgEl [style.color]=\"color\" [attr.width]=\"width\" [attr.height]=\"height\">\n  <use\n    [attr.width]=\"width\"\n    [attr.height]=\"height\"\n    [attr.xlink:href]=\"'#' + id\"\n  ></use>\n</svg>\n");

/***/ }),

/***/ "K1kB":
/*!************************************************************************!*\
  !*** ./src/app/modules/shared/components/search/search.component.scss ***!
  \************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzZWFyY2guY29tcG9uZW50LnNjc3MifQ== */");

/***/ }),

/***/ "KrPq":
/*!**********************************************************!*\
  !*** ./src/app/modules/shared/services/ClientService.ts ***!
  \**********************************************************/
/*! exports provided: ClientService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ClientService", function() { return ClientService; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _models_classes_user_Client__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../models/classes/user/Client */ "StnM");
/* harmony import */ var _models_enums_AppGendersEnum__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../models/enums/AppGendersEnum */ "9hfv");




let ClientService = class ClientService {
    constructor() { }
    getClient() {
        let client = new _models_classes_user_Client__WEBPACK_IMPORTED_MODULE_2__["Client"]();
        client.gender = _models_enums_AppGendersEnum__WEBPACK_IMPORTED_MODULE_3__["AppGendersEnum"].FEMALE;
        client.name = 'Usuário Teste';
        return client;
    }
};
ClientService.ctorParameters = () => [];
ClientService = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["Injectable"])({
        providedIn: 'root',
    })
], ClientService);



/***/ }),

/***/ "NWUy":
/*!*************************************************************!*\
  !*** ./src/app/modules/shared/models/constants/Messages.ts ***!
  \*************************************************************/
/*! exports provided: Messages */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Messages", function() { return Messages; });
const Messages = {
    INVALID_MAIL: 'Email inválido',
    INVALID_PASSWORD: 'Senha inválida',
    INVALID_DATA: 'Dado(s) inválido(s)',
};


/***/ }),

/***/ "OHCB":
/*!********************************************************************!*\
  !*** ./src/app/modules/shared/models/constants/util/RegexUtils.ts ***!
  \********************************************************************/
/*! exports provided: RegexUtils */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "RegexUtils", function() { return RegexUtils; });
const RegexUtils = {
    REGEX_TEXT: /^[0-9]/i,
    REGEX_NUMBER: /[0-9]/i,
    REGEX_MAIL: /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i,
    testRegex(regex, value) {
        return regex.test(value);
    },
    testMail(mail) {
        if (!mail) {
            return true;
        }
        return this.REGEX_MAIL.test(mail);
    },
};


/***/ }),

/***/ "PhYU":
/*!**************************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/shared/components/search/search.component.html ***!
  \**************************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<ion-searchbar\n  showCancelButton=\"never\"\n  [placeholder]=\"placeholder\"\n  inputmode=\"search\"\n  animated\n  (ionInput)=\"emitFind($event.target.value)\"\n></ion-searchbar>\n");

/***/ }),

/***/ "Sp+g":
/*!************************************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/shared/components/icons/icon-map/icon-map.component.html ***!
  \************************************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<!-- <div class=\"splashscreen\"> </div> -->\n<svg\n  xmlns=\"http://www.w3.org/2000/svg\"\n  width=\"0\"\n  height=\"0\"\n  style=\"display: block\"\n>\n  <defs>\n    <symbol\n      id=\"logout\"\n      width=\"24\"\n      height=\"24\"\n      viewBox=\"0 0 24 24\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        fill-rule=\"evenodd\"\n        clip-rule=\"evenodd\"\n        d=\"M5 3H19C20.1 3 21 3.9 21 5V19C21 20.1 20.1 21 19 21H5C3.89 21 3 20.1 3 19V15H5V19H19V5H5V9H3V5C3 3.9 3.89 3 5 3ZM11.5 17L10.09 15.59L12.67 13H3V11H12.67L10.09 8.41L11.5 7L16.5 12L11.5 17Z\"\n        fill=\"currentColor\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"calendar\"\n      width=\"27\"\n      height=\"30\"\n      viewBox=\"0 0 27 30\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        d=\"M25.7969 9.375H0.953125C0.566406 9.375 0.25 9.05859 0.25 8.67188V6.5625C0.25 5.00977 1.50977 3.75 3.0625 3.75H5.875V0.703125C5.875 0.316406 6.19141 0 6.57812 0H8.92188C9.30859 0 9.625 0.316406 9.625 0.703125V3.75H17.125V0.703125C17.125 0.316406 17.4414 0 17.8281 0H20.1719C20.5586 0 20.875 0.316406 20.875 0.703125V3.75H23.6875C25.2402 3.75 26.5 5.00977 26.5 6.5625V8.67188C26.5 9.05859 26.1836 9.375 25.7969 9.375ZM0.953125 11.25H25.7969C26.1836 11.25 26.5 11.5664 26.5 11.9531V27.1875C26.5 28.7402 25.2402 30 23.6875 30H3.0625C1.50977 30 0.25 28.7402 0.25 27.1875V11.9531C0.25 11.5664 0.566406 11.25 0.953125 11.25ZM7.75 23.2031C7.75 22.8164 7.43359 22.5 7.04688 22.5H4.70312C4.31641 22.5 4 22.8164 4 23.2031V25.5469C4 25.9336 4.31641 26.25 4.70312 26.25H7.04688C7.43359 26.25 7.75 25.9336 7.75 25.5469V23.2031ZM7.75 15.7031C7.75 15.3164 7.43359 15 7.04688 15H4.70312C4.31641 15 4 15.3164 4 15.7031V18.0469C4 18.4336 4.31641 18.75 4.70312 18.75H7.04688C7.43359 18.75 7.75 18.4336 7.75 18.0469V15.7031ZM15.25 23.2031C15.25 22.8164 14.9336 22.5 14.5469 22.5H12.2031C11.8164 22.5 11.5 22.8164 11.5 23.2031V25.5469C11.5 25.9336 11.8164 26.25 12.2031 26.25H14.5469C14.9336 26.25 15.25 25.9336 15.25 25.5469V23.2031ZM15.25 15.7031C15.25 15.3164 14.9336 15 14.5469 15H12.2031C11.8164 15 11.5 15.3164 11.5 15.7031V18.0469C11.5 18.4336 11.8164 18.75 12.2031 18.75H14.5469C14.9336 18.75 15.25 18.4336 15.25 18.0469V15.7031ZM22.75 23.2031C22.75 22.8164 22.4336 22.5 22.0469 22.5H19.7031C19.3164 22.5 19 22.8164 19 23.2031V25.5469C19 25.9336 19.3164 26.25 19.7031 26.25H22.0469C22.4336 26.25 22.75 25.9336 22.75 25.5469V23.2031ZM22.75 15.7031C22.75 15.3164 22.4336 15 22.0469 15H19.7031C19.3164 15 19 15.3164 19 15.7031V18.0469C19 18.4336 19.3164 18.75 19.7031 18.75H22.0469C22.4336 18.75 22.75 18.4336 22.75 18.0469V15.7031Z\"\n        fill=\"currentColor\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"inbox\"\n      width=\"30\"\n      height=\"20\"\n      viewBox=\"0 0 30 20\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        d=\"M29.5801 9.37021L24.0755 1.11323C23.8472 0.770792 23.5379 0.490014 23.175 0.295816C22.8121 0.101618 22.4069 6.50963e-06 21.9954 0H8.00463C7.59307 1.31819e-06 7.18787 0.101611 6.82501 0.29581C6.46214 0.490008 6.15283 0.770789 5.92453 1.11323L0.419896 9.37021C0.146098 9.78086 -6.02772e-06 10.2634 1.86516e-10 10.7569L1.86516e-10 17.5C1.86516e-10 18.8807 1.11927 20 2.5 20H27.5C28.8807 20 30 18.8807 30 17.5V10.7569C30 10.2634 29.8539 9.78086 29.5801 9.37021ZM8.45062 3.33333H21.5494L25.9939 10H19.5833L17.9167 13.3333H12.0833L10.4167 10H4.00615L8.45062 3.33333Z\"\n        fill=\"currentColor\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"angle-up\"\n      width=\"18\"\n      height=\"12\"\n      viewBox=\"0 0 18 12\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        d=\"M9.95092 0.771805L17.6033 8.42419C18.1322 8.95311 18.1322 9.80838 17.6033 10.3317L16.3317 11.6033C15.8028 12.1322 14.9475 12.1322 14.4242 11.6033L9 6.17912L3.57581 11.6033C3.04689 12.1322 2.19162 12.1322 1.66833 11.6033L0.396686 10.3317C-0.132229 9.80275 -0.132229 8.94748 0.396686 8.4242L8.04908 0.771805C8.56674 0.242889 9.42201 0.242889 9.95092 0.771805Z\"\n        fill=\"currentColor\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"angle-down\"\n      width=\"18\"\n      height=\"12\"\n      viewBox=\"0 0 18 12\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        d=\"M8.04908 11.2282L0.396686 3.57581C-0.132229 3.04689 -0.132229 2.19162 0.396686 1.66833L1.66833 0.396687C2.19725 -0.132229 3.05252 -0.132229 3.5758 0.396687L9 5.82088L14.4242 0.396687C14.9531 -0.132229 15.8084 -0.132229 16.3317 0.396687L17.6033 1.66833C18.1322 2.19725 18.1322 3.05252 17.6033 3.57581L9.95092 11.2282C9.43326 11.7571 8.57799 11.7571 8.04908 11.2282Z\"\n        fill=\"currentColor\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"angle-right\"\n      width=\"14\"\n      height=\"15\"\n      viewBox=\"0 0 14 15\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <g clip-path=\"url(#clip0)\">\n        <path\n          d=\"M11.0606 8.24352L5.11245 14.1917C4.70133 14.6028 4.03654 14.6028 3.62979 14.1917L2.64135 13.2032C2.23023 12.7921 2.23023 12.1273 2.64135 11.7206L6.85753 7.50437L2.64135 3.28819C2.23023 2.87707 2.23023 2.21228 2.64135 1.80553L3.62542 0.808341C4.03654 0.39722 4.70133 0.39722 5.10808 0.808341L11.0562 6.75648C11.4717 7.1676 11.4717 7.8324 11.0606 8.24352Z\"\n          fill=\"currentColor\"\n        />\n      </g>\n      <defs>\n        <clipPath id=\"clip0\">\n          <rect\n            width=\"14\"\n            height=\"14\"\n            fill=\"currentColor\"\n            transform=\"translate(0 0.5)\"\n          />\n        </clipPath>\n      </defs>\n    </symbol>\n\n    <symbol\n      id=\"angle-left\"\n      width=\"15\"\n      height=\"24\"\n      viewBox=\"0 0 15 24\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        fill-rule=\"evenodd\"\n        clip-rule=\"evenodd\"\n        d=\"M14.3999 21.2L11.6756 24L-9.82285e-05 12L11.6756 0L14.3999 2.8L5.44855 12L14.3999 21.2Z\"\n        fill=\"currentColor\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"bad-hand\"\n      width=\"31\"\n      height=\"30\"\n      viewBox=\"0 0 31 30\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        d=\"M0.5 3.28125V17.3437C0.5 18.1204 1.12959 18.75 1.90625 18.75H6.59374C7.3704 18.75 7.99999 18.1204 7.99999 17.3437V3.28125C7.99999 2.50459 7.3704 1.875 6.59374 1.875H1.90625C1.12959 1.875 0.5 2.50459 0.5 3.28125ZM2.84375 15C2.84375 14.2233 3.47334 13.5937 4.24999 13.5937C5.02665 13.5937 5.65624 14.2233 5.65624 15C5.65624 15.7766 5.02665 16.4062 4.24999 16.4062C3.47334 16.4062 2.84375 15.7766 2.84375 15ZM18.7812 30C17.5986 30 17.0536 27.6976 16.7931 26.6135C16.488 25.344 16.1726 24.0313 15.3052 23.1623C13.4027 21.2566 12.4047 18.8283 10.0835 16.5347C10.0175 16.4694 9.96503 16.3916 9.92925 16.3059C9.89346 16.2202 9.87504 16.1283 9.87505 16.0354V3.50982C9.87505 3.12656 10.1823 2.81384 10.5655 2.80681C11.4931 2.78982 12.7155 2.27484 13.6505 1.85888C15.5111 1.03113 17.8267 0.000996092 20.6559 0H20.8226C23.329 0 26.2931 0.0241992 27.489 1.7424C27.9807 2.44886 28.1011 3.32642 27.8492 4.35755C28.805 5.35675 29.3178 7.22062 28.8091 8.73784C29.8371 10.1108 29.9308 12.0268 29.3545 13.3942L29.361 13.4007C30.0578 14.1008 30.5049 15.2322 30.5 16.2833C30.4908 18.0617 28.9673 19.6875 27.0105 19.6875H21.0501C21.4783 21.348 23 22.7421 23 25.2274C23 29.5312 20.1875 30 18.7812 30Z\"\n        fill=\"#EF765E\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"paper\"\n      width=\"19\"\n      height=\"24\"\n      viewBox=\"0 0 19 24\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        d=\"M11 6.375V0H1.625C1.00156 0 0.5 0.501562 0.5 1.125V22.875C0.5 23.4984 1.00156 24 1.625 24H17.375C17.9984 24 18.5 23.4984 18.5 22.875V7.5H12.125C11.5063 7.5 11 6.99375 11 6.375ZM14 17.4375C14 17.7469 13.7469 18 13.4375 18H5.5625C5.25313 18 5 17.7469 5 17.4375V17.0625C5 16.7531 5.25313 16.5 5.5625 16.5H13.4375C13.7469 16.5 14 16.7531 14 17.0625V17.4375ZM14 14.4375C14 14.7469 13.7469 15 13.4375 15H5.5625C5.25313 15 5 14.7469 5 14.4375V14.0625C5 13.7531 5.25313 13.5 5.5625 13.5H13.4375C13.7469 13.5 14 13.7531 14 14.0625V14.4375ZM14 11.0625V11.4375C14 11.7469 13.7469 12 13.4375 12H5.5625C5.25313 12 5 11.7469 5 11.4375V11.0625C5 10.7531 5.25313 10.5 5.5625 10.5H13.4375C13.7469 10.5 14 10.7531 14 11.0625ZM18.5 5.71406V6H12.5V0H12.7859C13.0859 0 13.3719 0.117188 13.5828 0.328125L18.1719 4.92188C18.3828 5.13281 18.5 5.41875 18.5 5.71406Z\"\n        fill=\"#3A4859\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"nice-hand\"\n      width=\"31\"\n      height=\"30\"\n      viewBox=\"0 0 31 30\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        d=\"M30.5 26.7188L30.5 12.6563C30.5 11.8796 29.8704 11.25 29.0938 11.25L24.4063 11.25C23.6296 11.25 23 11.8796 23 12.6563L23 26.7188C23 27.4954 23.6296 28.125 24.4063 28.125L29.0938 28.125C29.8704 28.125 30.5 27.4954 30.5 26.7188ZM28.1563 15C28.1563 15.7767 27.5267 16.4063 26.75 16.4063C25.9733 16.4063 25.3438 15.7767 25.3438 15C25.3438 14.2234 25.9733 13.5938 26.75 13.5938C27.5267 13.5938 28.1563 14.2234 28.1563 15ZM12.2188 4.35599e-05C13.4014 4.34565e-05 13.9464 2.30237 14.2069 3.38646C14.512 4.65596 14.8274 5.96869 15.6948 6.83775C17.5973 8.74345 18.5953 11.1717 20.9165 13.4653C20.9825 13.5306 21.035 13.6084 21.0708 13.6941C21.1065 13.7798 21.125 13.8717 21.125 13.9646L21.125 26.4902C21.125 26.8734 20.8177 27.1862 20.4345 27.1932C19.5069 27.2102 18.2845 27.7252 17.3495 28.1411C15.4889 28.9689 13.1733 29.999 10.3441 30L10.1774 30C7.67097 30 4.70695 29.9758 3.51099 28.2576C3.01927 27.5511 2.89892 26.6736 3.15076 25.6424C2.19498 24.6433 1.68223 22.7794 2.19088 21.2622C1.16291 19.8892 1.06922 17.9732 1.64549 16.6058L1.63904 16.5993C0.942187 15.8992 0.495118 14.7678 0.500039 13.7167C0.509178 11.9383 2.03267 10.3125 3.98947 10.3125L9.94985 10.3125C9.52171 8.65199 8.00003 7.25793 8.00003 4.77262C8.00003 0.468792 10.8125 4.36828e-05 12.2188 4.35599e-05Z\"\n        fill=\"#36877B\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"search\"\n      width=\"58\"\n      height=\"58\"\n      viewBox=\"0 0 58 58\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/symbol\"\n    >\n      <path\n        d=\"M57.2112 50.1533L45.9162 38.8583C45.4064 38.3485 44.7154 38.0653 43.9903 38.0653H42.1437C45.2705 34.0662 47.1284 29.0361 47.1284 23.5642C47.1284 10.5473 36.5812 0 23.5642 0C10.5473 0 0 10.5473 0 23.5642C0 36.5812 10.5473 47.1284 23.5642 47.1284C29.0361 47.1284 34.0662 45.2705 38.0653 42.1437V43.9903C38.0653 44.7154 38.3485 45.4064 38.8583 45.9162L50.1533 57.2112C51.2182 58.2761 52.9402 58.2761 53.9938 57.2112L57.1999 54.0051C58.2648 52.9402 58.2648 51.2182 57.2112 50.1533ZM23.5642 38.0653C15.5547 38.0653 9.06316 31.5851 9.06316 23.5642C9.06316 15.5547 15.5433 9.06316 23.5642 9.06316C31.5738 9.06316 38.0653 15.5433 38.0653 23.5642C38.0653 31.5738 31.5851 38.0653 23.5642 38.0653Z\"\n        fill=\"currentColor\"\n      />\n    </symbol>\n    <symbol\n      id=\"circle-success\"\n      width=\"16\"\n      height=\"16\"\n      viewBox=\"0 0 16 16\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <g clip-path=\"url(#clip0)\">\n        <path\n          fill-rule=\"evenodd\"\n          clip-rule=\"evenodd\"\n          d=\"M1.33398 7.99967C1.33398 4.31967 4.32065 1.33301 8.00065 1.33301C11.6807 1.33301 14.6673 4.31967 14.6673 7.99967C14.6673 11.6797 11.6807 14.6663 8.00065 14.6663C4.32065 14.6663 1.33398 11.6797 1.33398 7.99967ZM3.33398 7.99967L6.66732 11.333L12.6673 5.33301L11.7273 4.38634L6.66732 9.44634L4.27398 7.05967L3.33398 7.99967Z\"\n          fill=\"currentColor\"\n        />\n      </g>\n      <defs>\n        <clipPath id=\"clip0\">\n          <rect width=\"16\" height=\"15.4702\" fill=\"white\" />\n        </clipPath>\n      </defs>\n    </symbol>\n\n    <symbol\n      id=\"circle-close\"\n      width=\"16\"\n      height=\"16\"\n      viewBox=\"0 0 16 16\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        d=\"M8 0C3.58065 0 0 3.58065 0 8C0 12.4194 3.58065 16 8 16C12.4194 16 16 12.4194 16 8C16 3.58065 12.4194 0 8 0ZM11.9226 10.1C12.0742 10.2516 12.0742 10.4968 11.9226 10.6484L10.6452 11.9226C10.4935 12.0742 10.2484 12.0742 10.0968 11.9226L8 9.80645L5.9 11.9226C5.74839 12.0742 5.50323 12.0742 5.35161 11.9226L4.07742 10.6452C3.92581 10.4935 3.92581 10.2484 4.07742 10.0968L6.19355 8L4.07742 5.9C3.92581 5.74839 3.92581 5.50323 4.07742 5.35161L5.35484 4.07419C5.50645 3.92258 5.75161 3.92258 5.90323 4.07419L8 6.19355L10.1 4.07742C10.2516 3.92581 10.4968 3.92581 10.6484 4.07742L11.9258 5.35484C12.0774 5.50645 12.0774 5.75161 11.9258 5.90323L9.80645 8L11.9226 10.1Z\"\n        fill=\"currentColor\"\n      />\n    </symbol>\n    <symbol\n      id=\"circle-warning\"\n      width=\"24\"\n      height=\"24\"\n      viewBox=\"0 0 24 24\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        d=\"M24 12C24 18.6289 18.627 24 12 24C5.37305 24 0 18.6289 0 12C0 5.37498 5.37305 0 12 0C18.627 0 24 5.37498 24 12ZM12 14.4194C10.7707 14.4194 9.77419 15.4159 9.77419 16.6452C9.77419 17.8744 10.7707 18.871 12 18.871C13.2293 18.871 14.2258 17.8744 14.2258 16.6452C14.2258 15.4159 13.2293 14.4194 12 14.4194ZM9.88679 6.41874L10.2457 12.9994C10.2625 13.3073 10.5171 13.5484 10.8255 13.5484H13.1745C13.4829 13.5484 13.7375 13.3073 13.7543 12.9994L14.1132 6.41874C14.1314 6.08613 13.8665 5.80645 13.5334 5.80645H10.4665C10.1334 5.80645 9.86864 6.08613 9.88679 6.41874Z\"\n        fill=\"currentColor\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"circle-denied\"\n      width=\"15\"\n      height=\"15\"\n      viewBox=\"0 0 15 15\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        d=\"M7.5 0C3.35788 0 0 3.35785 0 7.5C0 11.6421 3.35788 15 7.5 15C11.6421 15 15 11.6421 15 7.5C15 3.35788 11.6421 0 7.5 0ZM11.4347 3.56528C13.414 5.54456 13.5517 8.56975 12.06 10.6914L4.30857 2.94C6.43167 1.44738 9.45653 1.58713 11.4347 3.56528ZM3.56528 11.4347C1.58601 9.45544 1.44835 6.43025 2.93997 4.3086L10.6914 12.06C8.56836 13.5526 5.54347 13.4129 3.56528 11.4347Z\"\n        fill=\"currentColor\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"user\"\n      version=\"1.1\"\n      x=\"0px\"\n      y=\"0px\"\n      viewBox=\"0 0 480 480\"\n      style=\"enable-background: new 0 0 480 480\"\n      xml:space=\"preserve\"\n    >\n      <path\n        d=\"M240,0C107.664,0,0,107.664,0,240c0,57.96,20.656,111.184,54.992,152.704c0.088,0.12,0.096,0.272,0.192,0.384\n\t\t\tc24.792,29.896,55.928,52.816,90.624,67.624c0.4,0.168,0.792,0.352,1.192,0.52c2.808,1.184,5.648,2.28,8.496,3.352\n\t\t\tc1.12,0.424,2.24,0.856,3.376,1.264c2.456,0.88,4.928,1.712,7.416,2.512c1.592,0.512,3.184,1.016,4.792,1.496\n\t\t\tc2.2,0.656,4.408,1.288,6.632,1.888c1.952,0.528,3.92,1.016,5.888,1.488c1.992,0.48,3.992,0.96,6,1.384\n\t\t\tc2.24,0.48,4.504,0.904,6.776,1.32c1.824,0.336,3.64,0.688,5.48,0.984c2.52,0.408,5.056,0.728,7.6,1.056\n\t\t\tc1.64,0.208,3.272,0.448,4.92,0.624c2.88,0.304,5.784,0.52,8.696,0.72c1.352,0.096,2.696,0.24,4.056,0.312\n\t\t\tc4.248,0.24,8.544,0.368,12.872,0.368s8.624-0.128,12.888-0.352c1.36-0.072,2.704-0.216,4.056-0.312\n\t\t\tc2.912-0.208,5.816-0.416,8.696-0.72c1.648-0.176,3.28-0.416,4.92-0.624c2.544-0.328,5.08-0.648,7.6-1.056\n\t\t\tc1.832-0.296,3.656-0.648,5.48-0.984c2.264-0.416,4.528-0.84,6.776-1.32c2.008-0.432,4-0.904,6-1.384\n\t\t\tc1.968-0.48,3.936-0.968,5.888-1.488c2.224-0.592,4.432-1.232,6.632-1.888c1.608-0.48,3.2-0.984,4.792-1.496\n\t\t\tc2.488-0.8,4.96-1.632,7.416-2.512c1.128-0.408,2.248-0.84,3.376-1.264c2.856-1.072,5.688-2.176,8.496-3.352\n\t\t\tc0.4-0.168,0.792-0.352,1.192-0.52c34.688-14.808,65.832-37.728,90.624-67.624c0.096-0.112,0.104-0.272,0.192-0.384\n\t\t\tC459.344,351.184,480,297.96,480,240C480,107.664,372.336,0,240,0z M337.256,441.76c-0.12,0.056-0.232,0.12-0.352,0.176\n\t\t\tc-2.856,1.376-5.76,2.672-8.688,3.936c-0.664,0.28-1.32,0.568-1.984,0.848c-2.56,1.072-5.152,2.088-7.76,3.064\n\t\t\tc-1.088,0.408-2.176,0.808-3.272,1.192c-2.312,0.824-4.632,1.616-6.976,2.368c-1.456,0.464-2.92,0.904-4.384,1.336\n\t\t\tc-2.08,0.624-4.168,1.224-6.28,1.784c-1.776,0.472-3.568,0.904-5.36,1.328c-1.88,0.448-3.752,0.904-5.648,1.304\n\t\t\tc-2.072,0.44-4.16,0.816-6.24,1.192c-1.688,0.312-3.368,0.64-5.072,0.912c-2.344,0.368-4.712,0.664-7.072,0.96\n\t\t\tc-1.496,0.192-2.984,0.416-4.496,0.576c-2.696,0.288-5.416,0.472-8.128,0.664c-1.208,0.08-2.408,0.216-3.632,0.28\n\t\t\tc-3.96,0.208-7.928,0.32-11.912,0.32s-7.952-0.112-11.904-0.32c-1.216-0.064-2.416-0.192-3.632-0.28\n\t\t\tc-2.72-0.184-5.432-0.376-8.128-0.664c-1.512-0.16-3-0.384-4.496-0.576c-2.36-0.296-4.728-0.592-7.072-0.96\n\t\t\tc-1.704-0.272-3.384-0.6-5.072-0.912c-2.088-0.376-4.176-0.76-6.24-1.192c-1.896-0.4-3.776-0.856-5.648-1.304\n\t\t\tc-1.792-0.432-3.584-0.856-5.36-1.328c-2.104-0.56-4.2-1.168-6.28-1.784c-1.464-0.432-2.928-0.872-4.384-1.336\n\t\t\tc-2.344-0.752-4.672-1.544-6.976-2.368c-1.096-0.392-2.184-0.792-3.272-1.192c-2.608-0.976-5.2-1.992-7.76-3.064\n\t\t\tc-0.664-0.272-1.312-0.56-1.976-0.84c-2.928-1.256-5.832-2.56-8.696-3.936c-0.12-0.056-0.232-0.112-0.352-0.176\n\t\t\tc-27.912-13.504-52.568-32.672-72.576-55.952c15.464-56.944,59.24-102.848,115.56-121.112c1.112,0.68,2.272,1.288,3.416,1.928\n\t\t\tc0.672,0.376,1.336,0.776,2.016,1.136c2.384,1.264,4.8,2.448,7.272,3.512c1.896,0.832,3.856,1.536,5.808,2.256\n\t\t\tc0.384,0.136,0.768,0.288,1.152,0.424c10.848,3.84,22.456,6.04,34.6,6.04s23.752-2.2,34.592-6.04\n\t\t\tc0.384-0.136,0.768-0.288,1.152-0.424c1.952-0.72,3.912-1.424,5.808-2.256c2.472-1.064,4.888-2.248,7.272-3.512\n\t\t\tc0.68-0.368,1.344-0.76,2.016-1.136c1.144-0.64,2.312-1.248,3.432-1.936c56.32,18.272,100.088,64.176,115.56,121.112\n\t\t\tC389.824,409.08,365.168,428.248,337.256,441.76z M152,176c0-48.52,39.48-88,88-88s88,39.48,88,88\n\t\t\tc0,30.864-16.008,58.024-40.128,73.736c-3.152,2.048-6.432,3.88-9.8,5.48c-0.4,0.192-0.792,0.392-1.192,0.576\n\t\t\tc-23.168,10.536-50.592,10.536-73.76,0c-0.4-0.184-0.8-0.384-1.192-0.576c-3.376-1.6-6.648-3.432-9.8-5.48\n\t\t\tC168.008,234.024,152,206.864,152,176z M421.832,370.584c-18.136-53.552-59.512-96.832-112.376-117.392\n\t\t\tC330.6,234.144,344,206.64,344,176c0-57.344-46.656-104-104-104s-104,46.656-104,104c0,30.64,13.4,58.144,34.552,77.192\n\t\t\tc-52.864,20.568-94.24,63.84-112.376,117.392C31.672,333.792,16,288.704,16,240C16,116.488,116.488,16,240,16s224,100.488,224,224\n\t\t\tC464,288.704,448.328,333.792,421.832,370.584z\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"group\"\n      version=\"1.1\"\n      x=\"0px\"\n      y=\"0px\"\n      viewBox=\"0 0 512 512\"\n      style=\"enable-background: new 0 0 512 512\"\n      xml:space=\"preserve\"\n    >\n      <path\n        style=\"fill: #78d2fa\"\n        d=\"M217.21,353.387c-7.692-7.987-17.642-13.886-29.026-16.614l-41.143-9.859l-0.017,0.027l0.017-0.027\n\tv-25.117H96.799v25.198l0,0l-41.036,9.803C28.93,343.208,10,367.191,10,394.779V462h90.962L217.21,353.387z\"\n      />\n      <polygon\n        style=\"fill: #ffb487\"\n        points=\"148.12,301.797 148.12,327.592 122.046,390.047 96,327.681 96,301.797 \"\n      />\n      <path\n        style=\"fill: #ffcdac\"\n        d=\"M177.955,215.261v34.79c0,30.928-25.073,56-56.002,56l0,0l0,0c-30.929,0-56.002-25.072-56.002-56\n\tv-34.79L177.955,215.261L177.955,215.261z\"\n      />\n      <path\n        style=\"fill: #878791\"\n        d=\"M177.955,226.266v-13.481c0-30.928-25.073-56-56.002-56l0,0c-30.929,0-56.002,25.072-56.002,56\n\tv13.481h38.603c24.174,0,47.895-6.563,68.631-18.988l0,0\"\n      />\n      <path\n        style=\"fill: #a5dc69\"\n        d=\"M294.79,353.387c7.692-7.987,17.642-13.886,29.026-16.614l41.143-9.859l0.017,0.027l-0.017-0.027\n\tv-25.117h50.242v25.198l0,0l41.036,9.803C483.07,343.208,502,367.191,502,394.779V462h-90.962L294.79,353.387z\"\n      />\n      <path\n        style=\"fill: #ff5a5a\"\n        d=\"M220.953,352.403l-57.306,13.732c-37.348,8.95-63.685,42.343-63.685,80.747V502h311.87v-55.07\n\tc0-38.426-26.366-71.832-63.742-80.761l-57.157-13.654L220.953,352.403z\"\n      />\n      <g>\n        <polygon\n          style=\"fill: #ffb487\"\n          points=\"416,301.797 416,327.681 389.954,390.047 363.88,327.592 363.88,301.797 \t\"\n        />\n        <path\n          style=\"fill: #ffb487\"\n          d=\"M256.01,432.738l37.31-84.708c-2.769-4.65-4.347-10.062-4.347-15.792v-8.142h-65.966v8.143\n\t\tc0,5.72-1.572,11.124-4.333,15.769L256.01,432.738z\"\n        />\n      </g>\n      <path\n        style=\"fill: #ffcdac\"\n        d=\"M334.001,191.525v53.819c0,43.078-34.922,78.001-78,78.001l0,0l0,0c-43.078,0-78-34.922-78-78.001\n\tv-53.819H334.001z\"\n      />\n      <path\n        style=\"fill: #f5b955\"\n        d=\"M256,115.437L256,115.437c-43.079,0-78.001,34.922-78.001,78v18.777h38.137\n\tc25.351,0,49.402-11.225,65.684-30.656l0,0l52.179,30.656v-18.777C334.001,150.359,299.079,115.437,256,115.437z\"\n      />\n      <path\n        style=\"fill: #ffcdac\"\n        d=\"M334.045,215.261v34.79c0,30.928,25.073,56,56.002,56l0,0l0,0c30.929,0,56.002-25.072,56.002-56\n\tv-34.79L334.045,215.261L334.045,215.261z\"\n      />\n      <path\n        style=\"fill: #878791\"\n        d=\"M334.045,226.266v-13.481c0-30.928,25.073-56,56.002-56l0,0c30.929,0,56.002,25.072,56.002,56v13.481\n\th-38.603c-24.174,0-47.895-6.563-68.631-18.988l0,0\"\n      />\n      <path\n        d=\"M255.74,492c-2.631,0-5.211,1.07-7.07,2.93c-1.86,1.86-2.93,4.44-2.93,7.07s1.069,5.21,2.93,7.07\n\tc1.859,1.86,4.439,2.93,7.07,2.93c2.63,0,5.21-1.07,7.069-2.93c1.86-1.86,2.931-4.44,2.931-7.07s-1.07-5.21-2.931-7.07\n\tC260.95,493.07,258.37,492,255.74,492z\"\n      />\n      <path\n        d=\"M458.56,327.071l-33.358-7.969V305.87c18.516-11.703,30.848-32.342,30.848-55.818v-37.267c0-36.393-29.608-66-66.002-66\n\tc-19.632,0-37.279,8.626-49.38,22.275c-10.598-36.703-44.495-63.623-84.564-63.623h-0.001c-40.134,0-74.077,27.005-84.616,63.798\n\tc-12.104-13.75-29.816-22.45-49.532-22.45c-36.394,0-66.002,29.608-66.002,66v37.267c0,23.477,12.332,44.116,30.848,55.818v13.232\n\tl-33.358,7.969C21.976,334.587,0,362.43,0,394.779V462c0,5.523,4.478,10,10,10h79.963v30c0,5.523,4.478,10,10,10h109.704\n\tc5.522,0,10-4.477,10-10s-4.478-10-10-10h-44.643v-44.012c0-5.523-4.478-10-10-10s-10,4.477-10,10V492h-35.062v-45.118\n\tc0-33.914,23.034-63.119,56.015-71.022l49.183-11.786l31.646,71.996c1.596,3.631,5.187,5.976,9.153,5.976h0.001\n\tc3.966,0,7.558-2.344,9.154-5.975l31.614-71.891l49.04,11.715c33.011,7.885,56.065,37.096,56.065,71.034v11.159\n\tc-0.511,1.202-0.795,2.523-0.795,3.911s0.284,2.71,0.795,3.911V492h-34.857v-44.012c0-5.523-4.478-10-10-10s-10,4.477-10,10V492\n\th-48.975c-5.522,0-10,4.477-10,10s4.478,10,10,10h113.832c5.522,0,10-4.477,10-10v-30H502c5.522,0,10-4.477,10-10v-67.221\n\tC512,362.43,490.024,334.587,458.56,327.071z M405.224,327.535l-15.268,36.559l-15.062-36.078c0.04-0.363,0.069-0.728,0.069-1.094\n\tc0-0.093-0.001-0.187-0.004-0.28v-12.35c4.85,1.139,9.896,1.76,15.088,1.76c5.215,0,10.285-0.627,15.154-1.776v12.718\n\tC405.201,327.176,405.214,327.355,405.224,327.535z M210.953,335.568c-6.278-3.894-13.166-6.777-20.438-8.519l-33.474-8.021v-13.115\n\tc8.325-5.247,15.396-12.299,20.667-20.607c7.539,14.729,19.11,27.063,33.245,35.547V335.568z M188.1,245.345v-23.13h28.138\n\tc25.524,0,49.715-10.088,67.587-27.941l40.221,23.629v29.789c-1.244,36.411-31.233,65.654-67.943,65.654\n\tC218.605,313.345,188.1,282.84,188.1,245.345z M300.934,321.041c14.222-8.455,25.874-20.798,33.471-35.559\n\tc5.26,8.231,12.289,15.22,20.554,20.431v13.115l-33.474,8.021c-7.316,1.753-14.243,4.662-20.552,8.592v-14.6H300.934z\n\t M390.047,296.052c-25.365,0-46.002-20.636-46.002-46v-1.632c0.035-1.021,0.06-26.888,0.06-26.888\n\tc19.659,9.668,41.332,14.735,63.342,14.735h28.603v13.786C436.049,275.417,415.412,296.052,390.047,296.052z M390.047,166.785\n\tc25.365,0,46.002,20.636,46.002,46v2.476v1.005h-28.603c-21.606,0-42.837-5.673-61.548-16.426\n\tC351.504,180.758,369.174,166.785,390.047,166.785z M188.1,193.438c0-37.496,30.506-68,68.003-68c37.496,0,68.002,30.505,68.002,68\n\tv1.304l-37.115-21.805c-4.211-2.475-9.593-1.544-12.73,2.199c-14.42,17.208-35.568,27.078-58.021,27.078H188.1V193.438z\n\t M75.951,212.785c0-25.365,20.637-46,46.002-46c20.873,0,38.543,13.973,44.148,33.056c-18.711,10.752-39.941,16.426-61.548,16.426\n\tH75.951v-1.005V212.785z M75.951,236.266h28.603c22.032,0,43.727-5.076,63.401-14.763v28.549c0,25.365-20.637,46-46.002,46\n\ts-46.002-20.636-46.002-46C75.951,250.052,75.951,236.266,75.951,236.266z M121.953,316.052c5.192,0,10.238-0.622,15.088-1.76v12.07\n\tc-0.011,0.188-0.016,0.376-0.016,0.564c0,0.315,0.03,0.628,0.06,0.941l-15.13,36.227l-15.187-36.379\n\tc0.017-0.239,0.031-0.478,0.031-0.72v-12.718C111.668,315.425,116.738,316.052,121.953,316.052z M89.963,446.882V452H60v-44.429\n\tc0-5.523-4.478-10-10-10s-10,4.477-10,10V452H20v-57.221c0-23.055,15.662-42.898,38.087-48.255l31.698-7.573l20.688,49.555\n\tC97.534,404.58,89.963,424.954,89.963,446.882z M161.317,356.411c-5.905,1.415-11.548,3.384-16.906,5.812l9.74-23.322l31.703,7.597\n\tc2.459,0.589,4.855,1.368,7.174,2.314L161.317,356.411z M255.962,407.199l-25.009-56.897v-20.624\n\tc7.972,2.382,16.413,3.667,25.149,3.667c8.62,0,16.953-1.252,24.831-3.573v20.641L255.962,407.199z M318.789,348.888\n\tc2.376-0.98,4.833-1.785,7.357-2.39l31.626-7.578l9.78,23.426c-5.427-2.472-11.148-4.471-17.138-5.902L318.789,348.888z M492,452\n\th-20v-44.429c0-5.523-4.478-10-10-10s-10,4.477-10,10V452h-30.167v-5.07c0-21.899-7.546-42.245-20.448-58.305l20.753-49.692\n\tl31.775,7.591c22.425,5.357,38.087,25.2,38.087,48.255V452z\"\n      />\n      <path\n        d=\"M222.46,231.25c-2.63,0-5.21,1.07-7.07,2.93c-1.86,1.86-2.93,4.44-2.93,7.07s1.069,5.21,2.93,7.07s4.44,2.93,7.07,2.93\n\tc2.64,0,5.21-1.07,7.069-2.93c1.87-1.86,2.931-4.44,2.931-7.07s-1.061-5.21-2.931-7.07C227.67,232.32,225.09,231.25,222.46,231.25z\"\n      />\n      <path\n        d=\"M289.33,251.25c2.63,0,5.21-1.07,7.069-2.93c1.87-1.86,2.931-4.44,2.931-7.07s-1.061-5.21-2.931-7.07\n\tc-1.859-1.86-4.439-2.93-7.069-2.93s-5.21,1.07-7.07,2.93c-1.86,1.86-2.93,4.44-2.93,7.07s1.069,5.21,2.93,7.07\n\tS286.7,251.25,289.33,251.25z\"\n      />\n      <path\n        d=\"M275.247,267.842c-3.906-3.905-10.236-3.905-14.143,0c-2.957,2.957-7.768,2.957-10.725,0\n\tc-3.906-3.905-10.236-3.905-14.143,0c-3.905,3.905-3.905,10.237,0,14.143c5.378,5.377,12.441,8.066,19.505,8.066\n\tc7.064,0,14.127-2.688,19.505-8.066C279.152,278.079,279.152,271.747,275.247,267.842z\"\n      />\n      <path\n        d=\"M406.62,74h6.859c5.522,0,10-4.477,10-10s-4.478-10-10-10h-6.859c-5.522,0-10,4.477-10,10S401.098,74,406.62,74z\"\n      />\n      <path\n        d=\"M455.141,74H462c5.522,0,10-4.477,10-10s-4.478-10-10-10h-6.859c-5.522,0-10,4.477-10,10S449.618,74,455.141,74z\"\n      />\n      <path\n        d=\"M434.311,101.69c5.522,0,10-4.477,10-10v-6.859c0-5.523-4.478-10-10-10s-10,4.477-10,10v6.859\n\tC424.311,97.213,428.788,101.69,434.311,101.69z\"\n      />\n      <path\n        d=\"M434.311,53.169c5.522,0,10-4.477,10-10V36.31c0-5.523-4.478-10-10-10s-10,4.477-10,10v6.859\n\tC424.311,48.692,428.788,53.169,434.311,53.169z\"\n      />\n      <path\n        d=\"M49.444,74h6.858c5.522,0,10-4.477,10-10s-4.478-10-10-10h-6.858c-5.522,0-10,4.477-10,10S43.922,74,49.444,74z\"\n      />\n      <path\n        d=\"M97.965,74h6.858c5.522,0,10-4.477,10-10s-4.478-10-10-10h-6.858c-5.522,0-10,4.477-10,10S92.442,74,97.965,74z\"\n      />\n      <path\n        d=\"M77.134,101.69c5.522,0,10-4.477,10-10v-6.859c0-5.523-4.478-10-10-10s-10,4.477-10,10v6.859\n\tC67.134,97.213,71.611,101.69,77.134,101.69z\"\n      />\n      <path\n        d=\"M77.134,53.169c5.522,0,10-4.477,10-10V36.31c0-5.523-4.478-10-10-10s-10,4.477-10,10v6.859\n\tC67.134,48.692,71.611,53.169,77.134,53.169z\"\n      />\n      <path\n        d=\"M256,84.397c5.522,0,10-4.477,10-10v-26.31c0-5.523-4.478-10-10-10s-10,4.477-10,10v26.31\n\tC246,79.92,250.478,84.397,256,84.397z\"\n      />\n      <path\n        d=\"M256,20c2.63,0,5.21-1.07,7.069-2.93C264.93,15.21,266,12.63,266,10s-1.07-5.21-2.931-7.07C261.21,1.07,258.63,0,256,0\n\ts-5.21,1.07-7.07,2.93C247.069,4.79,246,7.37,246,10s1.069,5.21,2.93,7.07S253.37,20,256,20z\"\n      />\n      <path\n        d=\"M206.813,54.262c1.953,1.953,4.512,2.929,7.071,2.929s5.118-0.976,7.071-2.929c3.905-3.905,3.905-10.237,0-14.143\n\tl-14.634-14.634c-3.906-3.905-10.236-3.905-14.143,0c-3.905,3.905-3.905,10.237,0,14.143L206.813,54.262z\"\n      />\n      <path\n        d=\"M297.626,57.13c2.56,0,5.118-0.976,7.071-2.929l15.123-15.123c3.905-3.905,3.905-10.237,0-14.143\n\tc-3.906-3.905-10.236-3.905-14.143,0l-15.123,15.123c-3.905,3.905-3.905,10.237,0,14.143\n\tC292.508,56.154,295.066,57.13,297.626,57.13z\"\n      />\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n    </symbol>\n\n    <symbol\n      id=\"man\"\n      enable-background=\"new 0 0 464.056 464.056\"\n      height=\"512\"\n      viewBox=\"0 0 464.056 464.056\"\n      width=\"512\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        d=\"m386.028 416.796v39.26c0 4.42-3.58 8-8 8h-292c-4.42 0-8-3.58-8-8v-39.26c0-41.19 33.39-74.56 74.59-74.57 14.56-.01 27.38-7.5 34.76-18.86 7.414-11.394 6.65-21.302 6.65-29.31l.15-.37c-35.9-14.86-61.15-50.23-61.15-91.5v-3.13c-14.255 0-25-11.265-25-24.54v-41.56c-.32-14.47.34-65.5 37.2-101.03 42.86-41.31 110.78-37.93 159.98-15.83 1.6.72 1.55 3.01-.07 3.68l-12.83 5.28c-1.92.79-1.51 3.62.55 3.84l6.23.67c29.83 3.19 57.54 19.39 74.72 46.35.46.73.33 1.84-.26 2.47-10.6 11.21-16.52 26.09-16.52 41.56v54.57c0 13.55-10.99 24.54-24.54 24.54h-1.46v3.13c0 41.27-25.25 76.64-61.15 91.5l.15.37c0 7.777-.827 17.82 6.65 29.31 7.38 11.36 20.2 18.85 34.76 18.86 41.2.01 74.59 33.38 74.59 74.57z\"\n        fill=\"#ffdfba\"\n      />\n      <path\n        d=\"m386.028 416.796v39.26c0 4.418-3.582 8-8 8h-292c-4.418 0-8-3.582-8-8v-39.26c0-41.19 33.395-74.555 74.585-74.57 14.564-.005 27.387-7.504 34.765-18.86 25.754 22.002 63.531 22.015 89.3 0 7.377 11.356 20.201 18.855 34.765 18.86 41.19.015 74.585 33.38 74.585 74.57z\"\n        fill=\"#fe4f60\"\n      />\n      <path\n        d=\"m373.804 75.921c.464.729.334 1.833-.259 2.461-10.597 11.218-16.517 26.093-16.517 41.564v54.57c0 12.388-9.333 24.54-26 24.54v-61.77c0-26.51-21.49-48-48-48h-102c-26.51 0-48 21.49-48 48v61.77c-14.255 0-25-11.265-25-24.54v-41.56c-.32-14.47.34-65.5 37.2-101.03 42.857-41.311 110.784-37.929 159.976-15.827 1.6.719 1.558 3.01-.065 3.678l-12.831 5.282c-1.918.79-1.514 3.617.548 3.838l6.232.669c29.835 3.187 57.538 19.387 74.716 46.355z\"\n        fill=\"#42434d\"\n      />\n      <path\n        d=\"m331.028 202.186c0 54.696-44.348 99-99 99-51.492 0-99-40.031-99-102.13v-61.77c0-26.51 21.49-48 48-48h102c26.51 0 48 21.49 48 48z\"\n        fill=\"#ffebd2\"\n      />\n      <path\n        d=\"m313.028 447.056h-24c-4.418 0-8-3.582-8-8s3.582-8 8-8h24c4.418 0 8 3.582 8 8s-3.581 8-8 8z\"\n        fill=\"#fff\"\n      />\n      <path\n        d=\"m209.612 266.114c16.277 10.183 3.442 35.156-14.376 28.004-36.634-14.704-62.208-50.404-62.208-91.932v-64.9c0-10.084 3.11-19.442 8.422-27.168 6.514-9.473 21.578-5.288 21.578 7.168v64.9c0 36.51 19.192 66.79 46.584 83.928z\"\n        fill=\"#fff3e4\"\n      />\n      <path\n        d=\"m271.158 310.476c-24.637 10.313-51.712 11.113-78.26 0 1.356-5.626 1.13-9.27 1.13-16.42l.15-.37c24.082 9.996 51.571 10.016 75.7 0l.15.37c0 7.153-.226 10.796 1.13 16.42z\"\n        fill=\"#ffd6a6\"\n      />\n      <path\n        d=\"m192.91 366.383c-3.698 1.163-7.664 1.804-11.916 1.841-41.296.364-74.966 33.017-74.966 74.315v7.517c0 7.732-6.268 14-14 14h-6c-4.418 0-8-3.582-8-8v-39.26c0-41.191 33.395-74.555 74.585-74.57 14.564-.005 27.387-7.504 34.765-18.86 2.974 2.54 6.158 4.823 9.512 6.822 14.753 8.791 12.402 31.044-3.98 36.195z\"\n        fill=\"#ff6d7a\"\n      />\n      <path\n        d=\"m271.146 366.383c3.698 1.163 7.664 1.804 11.916 1.841 41.296.364 74.966 33.017 74.966 74.315v7.517c0 7.732 6.268 14 14 14h6c4.418 0 8-3.582 8-8v-39.26c0-41.191-33.395-74.555-74.585-74.57-14.564-.005-27.387-7.504-34.765-18.86-2.974 2.54-6.158 4.823-9.512 6.822-14.752 8.791-12.402 31.044 3.98 36.195z\"\n        fill=\"#e84857\"\n      />\n      <path\n        d=\"m305.138 19.776c-11.758 4.839-13.434 5.906-17.508 5.274-65.674-10.18-123.294 16.993-142.862 80.786v.01c-7.32 8.42-11.74 19.42-11.74 31.44v37.523c0 16.188-25 17.315-25-.293v-41.56c-.32-14.47.34-65.5 37.2-101.03 42.86-41.31 110.78-37.93 159.98-15.83 1.6.72 1.55 3.01-.07 3.68z\"\n        fill=\"currentColor\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"woman\"\n      enable-background=\"new 0 0 464 464\"\n      height=\"512\"\n      viewBox=\"0 0 464 464\"\n      width=\"512\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        d=\"m386.001 416.74v39.26c0 4.42-3.58 8-8 8h-292c-4.42 0-8-3.58-8-8v-39.26c0-30.19 17.95-56.2 43.76-67.93-10.531-8.379-26.582-19.641-38.26-43.87-16.265-33.698-13.481-73.452 7.24-104.57 11.26-16.9 17.26-36.74 17.26-57.04v-43.33c0-55.23 44.77-100 100-100h48c55.23 0 100 44.77 100 100 0 45.887-1.121 54.873 4.41 73.12 7.805 25.801 18.114 28.993 26.06 55.25 12.491 41.274-1.326 86.287-35.37 113.39l-8.86 7.05c25.81 11.73 43.76 37.74 43.76 67.93z\"\n        fill=\"#ffdfba\"\n      />\n      <path\n        d=\"m386.001 416.74v39.26c0 4.418-3.582 8-8 8h-292c-4.418 0-8-3.582-8-8v-39.26c0-41.162 33.369-74.57 74.57-74.57 6.13 0 11.95-1.33 17.18-3.71l.25.54 57.103 44.208c2.883 2.232 6.911 2.232 9.795 0l57.102-44.208.25-.54c5.23 2.38 11.05 3.71 17.18 3.71 41.041 0 74.57 33.249 74.57 74.57z\"\n        fill=\"#ffaa64\"\n      />\n      <path\n        d=\"m323.429 146.258c4.247.242 7.572 3.732 7.572 7.986v47.886c0 41.27-25.25 76.64-61.15 91.5-64.917 26.947-136.85-20.924-136.85-91.5v-47.19c0-4.689 4.016-8.394 8.686-7.971 47.987 4.351 95.242-7.767 134.923-34.499 4.513-3.04 10.727-.788 12.152 4.464 4.936 18.194 18.399 28.397 34.667 29.324z\"\n        fill=\"#ffebd2\"\n      />\n      <path\n        d=\"m351.101 341.76-8.86 7.05c-9.39-4.26-19.82-6.64-30.81-6.64-22.829 0-41.43-18.435-41.43-41.34v-6.83l-.15-.37c35.9-14.86 61.15-50.23 61.15-91.5v-47.886c0-4.254-3.325-7.744-7.572-7.986-16.168-.921-29.699-11.013-34.667-29.323-1.425-5.252-7.639-7.504-12.152-4.464-39.655 26.714-86.907 38.852-134.923 34.499-4.67-.423-8.686 3.282-8.686 7.971v47.19c0 41.27 25.25 76.64 61.15 91.5l-.15.37v6.83c0 22.901-18.596 41.34-41.43 41.34-10.99 0-21.42 2.38-30.81 6.64l-8.86-7.05c-43.011-34.272-52.588-95.695-22.16-141.39 11.26-16.9 17.26-36.74 17.26-57.04v-43.331c0-55.228 44.772-100 100-100h48c55.228 0 100 44.772 100 100v43.33c0 20.276 6 40.14 17.26 57.04 30.539 45.862 20.688 107.278-22.16 141.39z\"\n        fill=\"#42434d\"\n      />\n      <path\n        d=\"m271.131 310.42c-24.637 10.313-51.712 11.113-78.26 0 1.356-5.626 1.13-9.27 1.13-16.42l.15-.37c24.082 9.996 51.571 10.016 75.7 0l.15.37c0 7.153-.226 10.796 1.13 16.42z\"\n        fill=\"#ffd6a6\"\n      />\n      <path\n        d=\"m301.176 10.762c10.212 5.18 5.774 20.767-5.626 19.688-3.143-.298-6.329-.45-9.55-.45h-48c-55.228 0-100 44.772-100 100v12.168c0 7.184-5 6.952-5 12.772 0 52.822.214 49.478-.561 51.757-7.845 23.078-17.266 26.418-24.909 51.673-4.163 13.756-5.393 27.922-3.951 41.669 1.177 11.22-14.446 16.587-20.079 4.901-16.149-33.457-13.62-73.243 7.24-104.57 11.26-16.9 17.26-36.74 17.26-57.04v-43.33c0-55.228 44.772-100 100-100h48c16.257 0 31.607 3.879 45.176 10.762z\"\n        fill=\"#4d4e59\"\n      />\n      <path\n        d=\"m213.022 268.449c14.939 10 3.553 33.13-13.41 27.177-37.286-13.084-66.611-47.883-66.611-93.497v-47.19c0-4.69 4.02-8.39 8.69-7.97 3.832.348 8.04.622 12.581.761 8.219.25 14.729 7.037 14.729 15.26v23.14c0 34.826 17.756 64.738 44.021 82.319z\"\n        fill=\"#fff3e4\"\n      />\n      <path\n        d=\"m186.494 351.769c4.746 3.674 2.238 11.378-3.764 11.401-42.333.158-74.729 34.149-74.729 74.57v26.26h-22c-4.418 0-8-3.582-8-8v-39.26c0-41.163 33.37-74.57 74.57-74.57 6.13 0 11.95-1.33 17.18-3.71l.25.54z\"\n        fill=\"#ffbd7b\"\n      />\n      <path\n        d=\"m277.507 351.769c-4.746 3.674-2.238 11.378 3.764 11.401 42.333.158 74.729 34.149 74.729 74.57v26.26h22c4.418 0 8-3.582 8-8v-39.26c0-41.163-33.37-74.57-74.57-74.57-6.13 0-11.95-1.33-17.18-3.71l-.25.54z\"\n        fill=\"#faa157\"\n      />\n    </symbol>\n    <symbol\n      id=\"notification-active\"\n      width=\"24\"\n      height=\"24\"\n      viewBox=\"0 0 24 24\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        fill-rule=\"evenodd\"\n        clip-rule=\"evenodd\"\n        d=\"M18 11.5V16.5L20 18.5V19.5H4V18.5L6 16.5V11.5C6 8.42 7.63 5.86 10.5 5.18V4.5C10.5 3.67 11.17 3 12 3C12.83 3 13.5 3.67 13.5 4.5V5.18C16.36 5.86 18 8.43 18 11.5ZM14 20.5C14 21.6 13.1 22.5 12 22.5C10.89 22.5 10 21.6 10 20.5H14Z\"\n        fill=\"currentColor\"\n      />\n      <circle cx=\"18\" cy=\"6\" r=\"4\" fill=\"#EF765E\" />\n    </symbol>\n\n    <symbol\n      id=\"notification\"\n      width=\"24\"\n      height=\"24\"\n      viewBox=\"0 0 24 24\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        fill-rule=\"evenodd\"\n        clip-rule=\"evenodd\"\n        d=\"M18 11.5V16.5L20 18.5V19.5H4V18.5L6 16.5V11.5C6 8.42 7.63 5.86 10.5 5.18V4.5C10.5 3.67 11.17 3 12 3C12.83 3 13.5 3.67 13.5 4.5V5.18C16.36 5.86 18 8.43 18 11.5ZM14 20.5C14 21.6 13.1 22.5 12 22.5C10.89 22.5 10 21.6 10 20.5H14Z\"\n        fill=\"currentColor\"\n      />\n    </symbol>\n    <symbol\n      id=\"location\"\n      width=\"43\"\n      height=\"48\"\n      viewBox=\"0 0 43 48\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        fill-rule=\"evenodd\"\n        clip-rule=\"evenodd\"\n        d=\"M31.9149 15.9094C31.8761 18.2886 31.1952 20.8534 30.1424 23.4779C23.0148 23.7141 17.2873 29.5968 17.2873 36.8C17.2873 39.008 17.8283 41.0901 18.7794 42.9248C17.5682 44.8725 16.5904 46.6021 16.0622 48C15.3242 45.7771 13.0696 42.3624 10.4739 38.4309C5.8809 31.4745 0.219771 22.9004 0.00259267 16.4486C-0.154333 7.93709 6.83179 0.150431 15.6787 0.00216403C24.525 -0.146636 31.7585 7.40003 31.9149 15.9094ZM8.51187 16.0044C8.51187 20.1276 11.8456 23.469 15.9571 23.469C20.0696 23.469 23.4028 20.1276 23.4028 16.0044C23.4028 11.8823 20.069 8.53936 15.9571 8.53936C11.8461 8.53936 8.51187 11.8823 8.51187 16.0044Z\"\n        fill=\"#205DA7\"\n      />\n      <path\n        fill-rule=\"evenodd\"\n        clip-rule=\"evenodd\"\n        d=\"M19.6602 36.5104C19.6602 30.306 24.7464 25.2764 31.0219 25.2764C37.2973 25.2764 42.3836 30.306 42.3836 36.5104C42.3836 42.7148 37.2973 47.7445 31.0219 47.7445C24.7464 47.7445 19.6602 42.7148 19.6602 36.5104ZM31.0078 40.9502L37.1198 33.441C37.6538 32.7847 37.5488 31.8233 36.885 31.2953C36.2206 30.7679 35.2484 30.8711 34.7138 31.5286L29.5443 37.8801L26.6562 35.3091C26.0221 34.7447 25.0466 34.795 24.4753 35.422C23.9056 36.0489 23.9565 37.0135 24.5906 37.5778L28.5985 41.1455C28.9048 41.4172 29.3046 41.5659 29.7125 41.5659C29.7569 41.5659 29.8013 41.5638 29.8456 41.5595C30.2979 41.5226 30.7226 41.3006 31.0078 40.9502Z\"\n        fill=\"#205DA7\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"comments\"\n      width=\"24\"\n      height=\"24\"\n      viewBox=\"0 0 24 24\"\n      fill=\"none\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        d=\"M12 0C5.37188 0 0 4.9875 0 11.1429C0 13.8 1.00313 16.2321 2.67188 18.1446C2.08594 20.8446 0.126563 23.25 0.103125 23.2768C0 23.4 -0.028125 23.5821 0.0328125 23.7429C0.09375 23.9036 0.225 24 0.375 24C3.48281 24 5.8125 22.2964 6.96563 21.2464C8.49844 21.9054 10.2 22.2857 12 22.2857C18.6281 22.2857 24 17.2982 24 11.1429C24 4.9875 18.6281 0 12 0ZM6 12.8571C5.17031 12.8571 4.5 12.0911 4.5 11.1429C4.5 10.1946 5.17031 9.42857 6 9.42857C6.82969 9.42857 7.5 10.1946 7.5 11.1429C7.5 12.0911 6.82969 12.8571 6 12.8571ZM12 12.8571C11.1703 12.8571 10.5 12.0911 10.5 11.1429C10.5 10.1946 11.1703 9.42857 12 9.42857C12.8297 9.42857 13.5 10.1946 13.5 11.1429C13.5 12.0911 12.8297 12.8571 12 12.8571ZM18 12.8571C17.1703 12.8571 16.5 12.0911 16.5 11.1429C16.5 10.1946 17.1703 9.42857 18 9.42857C18.8297 9.42857 19.5 10.1946 19.5 11.1429C19.5 12.0911 18.8297 12.8571 18 12.8571Z\"\n        fill=\"currentColor\"\n      />\n    </symbol>\n\n    <symbol\n      id=\"heart\"\n      height=\"512pt\"\n      viewBox=\"0 -64 512 512\"\n      width=\"512pt\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <path\n        d=\"m380 3.207031c58.691406 13.195313 102.542969 65.621094 102.542969 128.300781 0 73.632813-51.007813 125.066407-95.445313 161.644532-28.765625 23.683594-56.621094 41.839844-59.703125 43.832031l-71.394531 46.152344-71.394531-46.152344c-3.082031-1.996094-30.9375-20.148437-59.703125-43.832031-44.4375-36.582032-95.445313-88.011719-95.445313-161.644532 0-72.628906 58.878907-131.507812 131.507813-131.507812 37.367187 0 71.09375 15.585938 95.035156 40.609375 23.933594-25.015625 57.644531-40.5976562 95-40.609375 0 0 17.140625-.0625 29 3.207031zm0 0\"\n        fill=\"#ef2d57\"\n      />\n      <g fill=\"#d4284d\">\n        <path\n          d=\"m388.6875 5.480469c15.070312 80.496093 25.277344 274.257812-207.882812 329.003906 1.941406 1.289063 3.261718 2.148437 3.800781 2.5l71.394531 46.152344 71.394531-46.152344c3.082031-1.996094 30.9375-20.148437 59.703125-43.832031 44.4375-36.582032 95.445313-88.011719 95.445313-161.644532 0-59.542968-39.578125-109.832031-93.855469-126.027343zm0 0\"\n        />\n        <path\n          d=\"m428.644531 221.96875-25.929687-52.125c-1.359375-2.730469-4.238282-4.371094-7.273438-4.140625-3.042968.230469-5.640625 2.273437-6.578125 5.175781l-23.929687 74.1875-29.507813-67.316406c-1.664062-3.792969-6.085937-5.519531-9.878906-3.855469-3.792969 1.660157-5.523437 6.085938-3.859375 9.878907l37.445312 85.421874c1.199219 2.734376 3.902344 4.488282 6.867188 4.488282.125 0 .253906-.003906.378906-.011719 3.113282-.15625 5.804688-2.222656 6.761719-5.1875l24.347656-75.476563 19.796875 39.800782c1.269532 2.546875 3.871094 4.160156 6.71875 4.160156h19.617188c3.753906-4.835938 7.339844-9.832031 10.710937-15zm0 0\"\n        />\n        <path\n          d=\"m308.867188 117.171875c-1.207032-2.761719-3.941407-4.527344-6.972657-4.488281-3.011719.042968-5.710937 1.886718-6.84375 4.679687l-35.324219 87.042969-29.679687-49.890625c-1.523437-2.5625-4.421875-3.976563-7.378906-3.609375-2.957031.371094-5.414063 2.460938-6.257813 5.316406l-29.917968 101.21875-38.394532-112.675781c-.980468-2.878906-3.601562-4.878906-6.632812-5.066406s-5.882813 1.472656-7.210938 4.207031l-37.945312 78.0625h-38.640625c3.371093 5.167969 6.960937 10.164062 10.714843 15h32.617188c2.871094 0 5.488281-1.640625 6.746094-4.222656l32.03125-65.894532 40.125 117.75c1.035156 3.042969 3.894531 5.082032 7.097656 5.082032h.152344c3.269531-.066406 6.113281-2.242188 7.039062-5.375l31.738282-107.375 28.625 48.113281c1.457031 2.449219 4.171874 3.859375 7.011718 3.644531s5.3125-2.019531 6.382813-4.65625l34.316406-84.5625 10.25 23.378906c1.660156 3.792969 6.082031 5.519532 9.878906 3.855469 3.792969-1.660156 5.519531-6.085937 3.859375-9.878906zm0 0\"\n        />\n      </g>\n      <path\n        d=\"m365.996094 254.675781c-2.964844 0-5.664063-1.75-6.863282-4.488281l-37.445312-85.421875c-1.664062-3.792969.0625-8.214844 3.855469-9.878906 3.796875-1.660157 8.21875.0625 9.882812 3.855469l29.503907 67.316406 23.933593-74.1875c.933594-2.898438 3.535157-4.945313 6.574219-5.175782 3.039062-.226562 5.917969 1.410157 7.277344 4.140626l25.929687 52.125h75.855469c4.140625 0 7.5 3.359374 7.5 7.5 0 4.140624-3.359375 7.5-7.5 7.5h-80.5c-2.847656 0-5.445312-1.609376-6.714844-4.160157l-19.800781-39.800781-24.347656 75.480469c-.957031 2.964843-3.648438 5.027343-6.757813 5.1875-.128906.003906-.253906.007812-.382812.007812zm0 0\"\n        fill=\"#ffcb05\"\n      />\n      <path\n        d=\"m187 270.675781c-3.203125 0-6.0625-2.039062-7.097656-5.082031l-40.125-117.75-32.03125 65.894531c-1.257813 2.582031-3.875 4.222657-6.746094 4.222657h-93.5c-4.140625 0-7.5-3.359376-7.5-7.5 0-4.144532 3.359375-7.5 7.5-7.5h88.808594l37.945312-78.0625c1.332032-2.734376 4.183594-4.390626 7.210938-4.207032 3.035156.1875 5.652344 2.1875 6.632812 5.066406l38.394532 112.675782 29.917968-101.21875c.84375-2.859375 3.300782-4.945313 6.261719-5.316406 2.953125-.371094 5.851563 1.046874 7.375 3.609374l29.679687 49.886719 35.324219-87.039062c1.132813-2.792969 3.832031-4.636719 6.847657-4.679688 3.027343-.0625 5.761718 1.726563 6.972656 4.488281l17.382812 39.652344c1.660156 3.796875-.066406 8.21875-3.859375 9.882813-3.792969 1.660156-8.214843-.066407-9.878906-3.859375l-10.25-23.375-34.316406 84.558594c-1.070313 2.640624-3.542969 4.445312-6.382813 4.660156-2.839844.21875-5.554687-1.199219-7.011718-3.644532l-28.625-48.117187-31.734376 107.378906c-.925781 3.132813-3.773437 5.304688-7.039062 5.371094-.054688.003906-.105469.003906-.15625.003906zm0 0\"\n        fill=\"currentColor\"\n      />\n    </symbol>\n\n    <symbol\n      version=\"1.1\"\n      id=\"traine\"\n      x=\"0px\"\n      y=\"0px\"\n      viewBox=\"0 0 50.455 50.455\"\n      style=\"enable-background: new 0 0 50.455 50.455\"\n      xml:space=\"preserve\"\n    >\n      <g>\n        <g>\n          <path\n            style=\"fill: #010002\"\n            d=\"M3.292,20.29l3.174-3.602l1.084,0.955l-3.174,3.602L3.292,20.29z M25.603,8.912\n\t\t\tc2.457,0,4.453-2.002,4.453-4.458C30.056,1.994,28.06,0,25.603,0s-4.454,1.994-4.454,4.454C21.148,6.91,23.145,8.912,25.603,8.912\n\t\t\tz M14.823,30.207l-1.086-0.959l3.177-3.6L18,26.607L14.823,30.207z M32.168,10.35l-0.003,0.021v0.002L32.168,10.35z M36.015,30.4\n\t\t\tl-3.227-3.562l1.07-0.971l3.227,3.562L36.015,30.4z M43.937,16.49l-1.074,0.971l3.225,3.557l1.075-0.969L43.937,16.49z\n\t\t\t M41.543,18.656l1.333,1.473l-1.848,1.674l-7.752-10.717c-0.278-0.387-0.682-0.621-1.113-0.701l0.002-0.014V10.35H18.51\n\t\t\tl0.016,0.085c-0.355,0.112-0.679,0.328-0.912,0.651L9.74,21.971l-2.043-1.804l1.19-1.349l-1.089-0.953l-3.175,3.599l1.087,0.959\n\t\t\tl1.44-1.637l2.187,1.932c-0.198,0.7,0.038,1.479,0.661,1.929c0.525,0.379,1.185,0.425,1.739,0.188l1.979,1.744l-1.314,1.491\n\t\t\tl1.087,0.955l3.175-3.601l-1.085-0.959l-1.314,1.491l-1.85-1.632c0.021-0.031,0.046-0.053,0.066-0.08l6.81-9.412l0.393,2.254\n\t\t\tL19.67,47.909c0,1.406,1.137,2.544,2.54,2.544c1.399,0,2.538-1.138,2.538-2.544V27.307h1.134v20.627l0.02,0.018\n\t\t\tc0.021,1.38,1.144,2.503,2.523,2.503c1.396,0,2.526-1.14,2.526-2.53l-0.002-30.796l0.46-2.553l6.965,9.63l-1.986,1.802\n\t\t\tl-1.207-1.331l-1.07,0.971l3.225,3.558l1.073-0.971l-1.464-1.613l2.056-1.86c0.581,0.318,1.313,0.303,1.894-0.114\n\t\t\tc0.688-0.496,0.907-1.389,0.592-2.135l1.953-1.769l1.334,1.474l1.069-0.973l-3.223-3.56L41.543,18.656z M30.95,16.096v-0.158\n\t\t\tl0.035-0.01L30.95,16.096z\"\n          />\n        </g>\n      </g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n      <g></g>\n    </symbol>\n\n    <symbol\n      id=\"aesthetics\"\n      enable-background=\"new 0 0 486.066 486.066\"\n      height=\"512\"\n      viewBox=\"0 0 486.066 486.066\"\n      width=\"512\"\n      xmlns=\"http://www.w3.org/2000/svg\"\n    >\n      <g>\n        <path\n          d=\"m43.826 191.24h16.367l15.518 279.331c.241 4.394 3.998 7.761 8.393 7.52 4.057-.222 7.298-3.463 7.52-7.52l15.518-279.331h16.367c21.993-.025 39.817-17.848 39.841-39.841v-63.746c0-4.401-3.568-7.968-7.968-7.968v-71.715c0-4.401-3.568-7.968-7.968-7.968h-127.493c-4.401 0-7.968 3.568-7.968 7.968v71.714c-4.401 0-7.968 3.568-7.968 7.968v63.746c.024 21.994 17.848 39.817 39.841 39.842zm47.81-111.556v-63.746h15.937v63.746zm-15.937 0h-15.936v-63.746h15.937v63.746zm71.714 15.937v15.937h-127.492v-15.937zm-23.904 79.683h-23.905c-4.229 0-7.722 3.303-7.956 7.526l-7.98 143.65-7.98-143.65c-.235-4.223-3.727-7.526-7.956-7.526h-23.906c-13.196-.015-23.89-10.709-23.905-23.905v-23.905h127.492v23.905c-.014 13.196-10.708 23.89-23.904 23.905zm15.936-95.62h-15.937v-63.746h15.937zm-111.556-63.746h15.937v63.746h-15.937z\"\n        />\n        <path\n          d=\"m187.255 486.066h223.111c4.401 0 7.968-3.568 7.968-7.968v-24.702c18.539-3.811 31.851-20.118 31.873-39.044v-109.144l30.534-45.802c2.441-3.662 1.452-8.609-2.209-11.05-1.309-.873-2.847-1.338-4.42-1.339h-43.37l3.474-62.551 23.722-94.885c1.066-4.27-1.532-8.595-5.802-9.66-.631-.157-1.278-.237-1.928-.237v-55.777c0-4.401-3.568-7.968-7.968-7.968h-63.746c-4.401 0-7.968 3.568-7.968 7.968v55.778c-4.401 0-7.968 3.568-7.968 7.968 0 .651.08 1.3.238 1.932l23.721 94.882 3.474 62.551h-87.184l2.988-55.778h24.889c4.401 0 7.968-3.568 7.968-7.968 0-4.401-3.568-7.968-7.968-7.968h-24.035l.854-15.937h23.182c4.401 0 7.968-3.568 7.968-7.968s-3.568-7.968-7.968-7.968h-22.328l.854-15.937h21.474c4.401 0 7.968-3.568 7.968-7.968 0-4.401-3.568-7.968-7.968-7.968h-20.618l.854-15.937h19.764c4.401 0 7.968-3.568 7.968-7.968 0-4.401-3.568-7.968-7.968-7.968h-18.913l.854-15.937h18.059c4.401 0 7.968-3.568 7.968-7.968s-3.568-7.968-7.968-7.968h-17.205l.854-15.937h16.352c4.401 0 7.968-3.568 7.968-7.968s-3.568-7.968-7.968-7.968h-62.211l-38.42-15.367c-4.086-1.634-8.723.354-10.357 4.441-.058.145-.112.292-.161.44l-39.841 119.524c-1.334 4.003.682 8.351 4.6 9.918l38.525 15.409c1.257.77 2.715 1.152 4.188 1.096.823.067 6.375.74 12.756 6.906 6.763 6.534 15.595 20.487 19.266 49.856.853 6.82 1.956 19.87 3.287 38.852h-138.809c-4.401 0-7.968 3.568-7.968 7.968 0 1.573.466 3.111 1.339 4.42l30.534 45.806v109.143c.022 18.926 13.334 35.234 31.873 39.044v24.702c-.001 4.401 3.567 7.969 7.968 7.969zm7.968-15.937v-15.937h207.175v15.937zm239.048-390.445h-15.937v-47.81h15.937zm-47.81-47.809h15.937v47.81h-15.937zm15.925 150.955c-.028-.504-.104-1.004-.226-1.494l-21.43-85.715h59.272l-21.43 85.719c-.122.49-.198.99-.226 1.494l-3.566 64.184h-8.829zm-170.496-78.978-25.206-9.45 5.289-15.865 25.2 9.456zm10.329-30.988-25.2-9.456 5.286-15.859 25.206 9.45zm-10.236-54.357 25.019 10.007-4.451 13.356-25.206-9.45zm-30.342 91.024 25.206 9.45-4.638 13.913-25.019-10.007zm73.203 96.658c-5.976-47.769-25.325-63.278-37.498-68.311l35.334-106.003h25.692l-11.526 215.143h-8.554c-1.386-19.876-2.545-33.605-3.448-40.829zm184.379 56.765-21.248 31.873h-278.329l-21.248-31.873zm-295.873 151.397v-103.587h270.921v103.587c-.015 13.196-10.709 23.89-23.905 23.905h-223.111c-13.196-.015-23.89-10.709-23.905-23.905z\"\n        />\n      </g>\n    </symbol>\n  </defs>\n</svg>\n");

/***/ }),

/***/ "StnM":
/*!**************************************************************!*\
  !*** ./src/app/modules/shared/models/classes/user/Client.ts ***!
  \**************************************************************/
/*! exports provided: Client */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "Client", function() { return Client; });
class Client {
    constructor() {
        this.dataNascimento = null;
        this.name = null;
        this.gender = null;
        this.mail = null;
        this.person = null;
        this.image = null;
    }
}


/***/ }),

/***/ "Sy1n":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _raw_loader_app_component_html__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! raw-loader!./app.component.html */ "VzVu");
/* harmony import */ var _app_component_scss__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app.component.scss */ "ynWL");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _modules_shared_models_classes_user_Client__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./modules/shared/models/classes/user/Client */ "StnM");
/* harmony import */ var _modules_shared_models_enums_AppGendersEnum__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./modules/shared/models/enums/AppGendersEnum */ "9hfv");
/* harmony import */ var _modules_shared_models_enums_AppIconsEnum__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./modules/shared/models/enums/AppIconsEnum */ "wTr2");
/* harmony import */ var _modules_shared_models_enums_AppRoutesEnum__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./modules/shared/models/enums/AppRoutesEnum */ "c6vd");
/* harmony import */ var _modules_shared_services_ClientService__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./modules/shared/services/ClientService */ "KrPq");









let AppComponent = class AppComponent {
    constructor(_clientService) {
        this._clientService = _clientService;
        this.client = new _modules_shared_models_classes_user_Client__WEBPACK_IMPORTED_MODULE_4__["Client"]();
        this.appPages = [];
        this.labels = ['Family', 'Friends', 'Notes', 'Work', 'Travel', 'Reminders'];
    }
    ngOnInit() {
        this.client = this._clientService.getClient();
        this._setPages();
    }
    _setPages() {
        const gender = this.client.gender == _modules_shared_models_enums_AppGendersEnum__WEBPACK_IMPORTED_MODULE_5__["AppGendersEnum"].MALE
            ? _modules_shared_models_enums_AppIconsEnum__WEBPACK_IMPORTED_MODULE_6__["AppIconsEnum"].MAN
            : _modules_shared_models_enums_AppIconsEnum__WEBPACK_IMPORTED_MODULE_6__["AppIconsEnum"].WOMAN;
        this.appPages.push({
            title: 'Meu Perfil',
            url: '/folder/Inbox',
            icon: gender,
        });
        this.appPages.push({
            title: 'Configurações',
            url: '/folder/Trash',
            icon: _modules_shared_models_enums_AppIconsEnum__WEBPACK_IMPORTED_MODULE_6__["AppIconsEnum"].GROUP,
        });
        this.appPages.push({
            title: 'Sair',
            url: _modules_shared_models_enums_AppRoutesEnum__WEBPACK_IMPORTED_MODULE_7__["AppRoutesEnum"].SECURITY,
            icon: _modules_shared_models_enums_AppIconsEnum__WEBPACK_IMPORTED_MODULE_6__["AppIconsEnum"].LOG_OUT,
        });
    }
};
AppComponent.ctorParameters = () => [
    { type: _modules_shared_services_ClientService__WEBPACK_IMPORTED_MODULE_8__["ClientService"] }
];
AppComponent = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-root',
        template: _raw_loader_app_component_html__WEBPACK_IMPORTED_MODULE_1__["default"],
        styles: [_app_component_scss__WEBPACK_IMPORTED_MODULE_2__["default"]]
    })
], AppComponent);



/***/ }),

/***/ "TnyQ":
/*!**********************************************************************!*\
  !*** ./src/app/modules/shared/components/footer/footer.component.ts ***!
  \**********************************************************************/
/*! exports provided: FooterComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FooterComponent", function() { return FooterComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _raw_loader_footer_component_html__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! raw-loader!./footer.component.html */ "G3Xc");
/* harmony import */ var _footer_component_scss__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./footer.component.scss */ "c8ye");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "fXoL");




let FooterComponent = class FooterComponent {
    constructor() {
        this.stylez = {};
        this.clazz = {};
    }
    ngOnInit() {
        this.clazz = "footer " + this.clazz;
    }
};
FooterComponent.ctorParameters = () => [];
FooterComponent.propDecorators = {
    stylez: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['stylez',] }],
    clazz: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['clazz',] }]
};
FooterComponent = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-footer',
        template: _raw_loader_footer_component_html__WEBPACK_IMPORTED_MODULE_1__["default"],
        styles: [_footer_component_scss__WEBPACK_IMPORTED_MODULE_2__["default"]]
    })
], FooterComponent);



/***/ }),

/***/ "U1ec":
/*!************************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/shared/components/input/input.component.html ***!
  \************************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<ion-item lines=\"none\" [ngStyle]=\"stylezz\" [color]=\"background\">\n  <ion-label *ngIf=\"label\" [style.color]=\"color\" [position]=\"position\">{{\n    label\n  }}</ion-label>\n  <ng-container [ngSwitch]=\"type\">\n    <ion-input\n      *ngSwitchCase=\"'cpf'\"\n      (ionChange)=\"emitVal()\"\n      [id]=\"id\"\n      [required]=\"required\"\n      [readonly]=\"readonly\"\n      [(ngModel)]=\"value\"\n      [maxlength]=\"14\"\n      [minlength]=\"14\"\n      [brmasker]=\"{ mask: '000.000.000-00', type: 'num' }\"\n    ></ion-input>\n    <ion-input\n      *ngSwitchCase=\"'cep'\"\n      (ionChange)=\"emitVal()\"\n      [id]=\"id\"\n      [required]=\"required\"\n      [readonly]=\"readonly\"\n      [(ngModel)]=\"value\"\n      [maxlength]=\"9\"\n      [minlength]=\"9\"\n      [brmasker]=\"{ mask: '00.000-000', type: 'num' }\"\n    ></ion-input>\n    <ion-input\n      *ngSwitchCase=\"'password'\"\n      (ionChange)=\"emitVal()\"\n      [id]=\"id\"\n      [required]=\"required\"\n      [readonly]=\"readonly\"\n      [(ngModel)]=\"value\"\n      [type]=\"typeToogle ? 'text' : 'password'\"\n      [maxlength]=\"maxlength\"\n      [minlength]=\"minlength\"\n    ></ion-input>\n    <ion-input\n      *ngSwitchCase=\"'money'\"\n      (ionChange)=\"emitVal()\"\n      [id]=\"id\"\n      [required]=\"required\"\n      [readonly]=\"readonly\"\n      [(ngModel)]=\"value\"\n      [maxlength]=\"14\"\n      [brmasker]=\"{\n        money: true,\n        thousand: '.',\n        decimalCaracter: ',',\n        decimal: 2\n      }\"\n    ></ion-input>\n    <ion-input\n      *ngSwitchCase=\"'phone'\"\n      (ionChange)=\"emitVal()\"\n      [id]=\"id\"\n      [required]=\"required\"\n      [readonly]=\"readonly\"\n      [(ngModel)]=\"value\"\n      [type]=\"type\"\n      [maxlength]=\"maxlength\"\n      [minlength]=\"minlength\"\n      [brmasker]=\"{ phone: true }\"\n    ></ion-input>\n    <ion-datetime\n      *ngSwitchCase=\"'date'\"\n      displayFormat=\"DD/MM/YYYY\"\n      (ionChange)=\"emitVal()\"\n      cancelText=\"Sair\"\n      doneText=\"Salvar\"\n      [min]=\"min\"\n      [max]=\"max\"\n      [(ngModel)]=\"value\"\n    ></ion-datetime>\n    <ion-input\n      *ngSwitchCase=\"'datetime'\"\n      (ionChange)=\"emitVal()\"\n      [id]=\"id\"\n      [required]=\"required\"\n      [readonly]=\"readonly\"\n      [(ngModel)]=\"value\"\n      [type]=\"type\"\n      [maxlength]=\"10\"\n      [brmasker]=\"{ mask: '00/00/0000', type: 'num' }\"\n    ></ion-input>\n\n    <ng-container *ngSwitchDefault>\n      <ion-input\n        *ngIf=\"mask\"\n        (ionChange)=\"emitVal()\"\n        [id]=\"id\"\n        [required]=\"required\"\n        [readonly]=\"readonly\"\n        [(ngModel)]=\"value\"\n        [type]=\"type\"\n        [brmasker]=\"mask\"\n        [maxlength]=\"maxlength\"\n        [minlength]=\"minlength\"\n      ></ion-input>\n      <ion-input\n        *ngIf=\"!mask\"\n        (ionChange)=\"emitVal()\"\n        [id]=\"id\"\n        [required]=\"required\"\n        [readonly]=\"readonly\"\n        [(ngModel)]=\"value\"\n        [type]=\"type\"\n        [maxlength]=\"maxlength\"\n        [minlength]=\"minlength\"\n      ></ion-input>\n    </ng-container>\n  </ng-container>\n</ion-item>\n<ion-toggle\n  *ngIf=\"type == 'password'\"\n  class=\"float-right\"\n  color=\"secondary\"\n  [(ngModel)]=\"typeToogle\"\n></ion-toggle>\n<app-text-msg\n  *ngIf=\"showValidation\"\n  type=\"danger\"\n  [validated]=\"validation.validate\"\n  [text]=\"validation.text\"\n></app-text-msg>\n");

/***/ }),

/***/ "VzVu":
/*!**************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/app.component.html ***!
  \**************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<ion-app>\n  <ion-split-pane contentId=\"main-content\">\n    <ion-menu type=\"push\" contentId=\"main-content\">\n      <ion-list id=\"inbox-list\">\n        <ion-list-header\n          ><ion-avatar>\n            <img src=\"../assets/img/logo-care.jpeg\" />\n          </ion-avatar>\n          <ion-label class=\"ml-2\">{{ client.name }}</ion-label>\n        </ion-list-header>\n        <ion-note></ion-note>\n\n        <ion-menu-toggle\n          auto-hide=\"false\"\n          *ngFor=\"let p of appPages; let i = index\"\n        >\n          <ion-item\n            routerDirection=\"root\"\n            [routerLink]=\"[p.url]\"\n            lines=\"none\"\n            detail=\"false\"\n            routerLinkActive=\"selected\"\n          >\n            <!-- <ion-icon\n                slot=\"start\"\n                [ios]=\"p.icon + '-outline'\"\n                [md]=\"p.icon + '-sharp'\"\n              ></ion-icon> -->\n            <app-icon\n              color=\"primary\"\n              [icon]=\"p.icon\"\n              height=\"25px\"\n              width=\"25px\"\n            ></app-icon>\n            <ion-label class=\"ml-3\"> {{ p.title }}</ion-label>\n          </ion-item>\n        </ion-menu-toggle>\n      </ion-list>\n\n      <!-- <ion-list id=\"labels-list\">\n          <ion-list-header>Labels</ion-list-header>\n\n          <ion-item *ngFor=\"let label of labels\" lines=\"none\">\n            <ion-icon slot=\"start\" ios=\"bookmark-outline\" md=\"bookmark-sharp\"></ion-icon>\n            <ion-label>{{ label }}</ion-label>\n          </ion-item>\n        </ion-list> -->\n    </ion-menu>\n    <ion-router-outlet id=\"main-content\"></ion-router-outlet>\n  </ion-split-pane>\n</ion-app>\n");

/***/ }),

/***/ "ZAI4":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/platform-browser */ "jhN1");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "tyNb");
/* harmony import */ var _ionic_angular__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @ionic/angular */ "TEn/");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./app.component */ "Sy1n");
/* harmony import */ var _app_routing_module__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./app-routing.module */ "vY5A");
/* harmony import */ var br_mask__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! br-mask */ "mzEM");
/* harmony import */ var _modules_shared_shared_module__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./modules/shared/shared.module */ "FpXt");









let AppModule = class AppModule {
};
AppModule = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        declarations: [_app_component__WEBPACK_IMPORTED_MODULE_5__["AppComponent"]],
        entryComponents: [],
        imports: [
            _angular_platform_browser__WEBPACK_IMPORTED_MODULE_2__["BrowserModule"],
            _app_routing_module__WEBPACK_IMPORTED_MODULE_6__["AppRoutingModule"],
            _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["IonicModule"].forRoot(),
            br_mask__WEBPACK_IMPORTED_MODULE_7__["BrMaskerModule"],
            _modules_shared_shared_module__WEBPACK_IMPORTED_MODULE_8__["SharedModule"],
        ],
        exports: [],
        providers: [{ provide: _angular_router__WEBPACK_IMPORTED_MODULE_3__["RouteReuseStrategy"], useClass: _ionic_angular__WEBPACK_IMPORTED_MODULE_4__["IonicRouteStrategy"] }],
        bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_5__["AppComponent"]],
    })
], AppModule);



/***/ }),

/***/ "c6vd":
/*!**************************************************************!*\
  !*** ./src/app/modules/shared/models/enums/AppRoutesEnum.ts ***!
  \**************************************************************/
/*! exports provided: AppRoutesEnum */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutesEnum", function() { return AppRoutesEnum; });
var AppRoutesEnum;
(function (AppRoutesEnum) {
    AppRoutesEnum["ACCOUNT"] = "account";
    AppRoutesEnum["FIND"] = "find";
    AppRoutesEnum["FULL"] = "full";
    AppRoutesEnum["HOME"] = "home";
    AppRoutesEnum["LOGIN"] = "login";
    AppRoutesEnum["NONE"] = "";
    AppRoutesEnum["PREFIX"] = "prefix";
    AppRoutesEnum["REGISTER"] = "register";
    AppRoutesEnum["SECURITY"] = "security";
})(AppRoutesEnum || (AppRoutesEnum = {}));


/***/ }),

/***/ "c8ye":
/*!************************************************************************!*\
  !*** ./src/app/modules/shared/components/footer/footer.component.scss ***!
  \************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = (".footer {\n  position: absolute;\n  left: 0;\n  bottom: 0%;\n  width: 100%;\n  text-align: center;\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIi4uLy4uLy4uLy4uLy4uLy4uL2Zvb3Rlci5jb21wb25lbnQuc2NzcyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtFQUNFLGtCQUFBO0VBQ0EsT0FBQTtFQUNBLFVBQUE7RUFDQSxXQUFBO0VBQ0Esa0JBQUE7QUFDRiIsImZpbGUiOiJmb290ZXIuY29tcG9uZW50LnNjc3MiLCJzb3VyY2VzQ29udGVudCI6WyIuZm9vdGVyIHtcbiAgcG9zaXRpb246IGFic29sdXRlO1xuICBsZWZ0OiAwO1xuICBib3R0b206IDAlO1xuICB3aWR0aDogMTAwJTtcbiAgdGV4dC1hbGlnbjogY2VudGVyO1xufVxuIl19 */");

/***/ }),

/***/ "cWNS":
/*!********************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/shared/components/img/img.component.html ***!
  \********************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<div>\n  <img\n    class=\"rounded-circle\"\n    [width]=\"width\"\n    [height]=\"height\"\n    [class]=\"clazz\"\n    [src]=\"source\"\n  />\n</div>\n");

/***/ }),

/***/ "eVpS":
/*!************************************************************************!*\
  !*** ./src/app/modules/shared/components/header/header.component.scss ***!
  \************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJoZWFkZXIuY29tcG9uZW50LnNjc3MifQ== */");

/***/ }),

/***/ "g0gg":
/*!********************************************************************************!*\
  !*** ./src/app/modules/shared/components/icons/svg-icon/svg-icon.component.ts ***!
  \********************************************************************************/
/*! exports provided: SvgIconComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SvgIconComponent", function() { return SvgIconComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _raw_loader_svg_icon_component_html__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! raw-loader!./svg-icon.component.html */ "HU6n");
/* harmony import */ var _svg_icon_component_scss__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./svg-icon.component.scss */ "8ulg");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "fXoL");




let SvgIconComponent = class SvgIconComponent {
    constructor() { }
    ngOnInit() { }
};
SvgIconComponent.ctorParameters = () => [];
SvgIconComponent.propDecorators = {
    svgEl: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["ViewChild"], args: ['svgEl',] }],
    width: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"] }],
    height: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"] }],
    color: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"] }],
    id: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"] }]
};
SvgIconComponent = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-svg-icon',
        template: _raw_loader_svg_icon_component_html__WEBPACK_IMPORTED_MODULE_1__["default"],
        styles: [_svg_icon_component_scss__WEBPACK_IMPORTED_MODULE_2__["default"]]
    })
], SvgIconComponent);



/***/ }),

/***/ "iC0x":
/*!********************************************************************!*\
  !*** ./src/app/modules/shared/components/input/input.component.ts ***!
  \********************************************************************/
/*! exports provided: InputComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "InputComponent", function() { return InputComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _raw_loader_input_component_html__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! raw-loader!./input.component.html */ "U1ec");
/* harmony import */ var _input_component_scss__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./input.component.scss */ "utrD");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _models_constants_Messages__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../../models/constants/Messages */ "NWUy");
/* harmony import */ var _models_constants_util_RegexUtils__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../../models/constants/util/RegexUtils */ "OHCB");






let InputComponent = class InputComponent {
    constructor() {
        this.color = 'primary';
        this.showValidation = false;
        this.readonly = false;
        this.required = false;
        this.validation = { validate: true, text: null };
        this.type = 'text';
        this.position = 'stacked';
        this.maxlength = 300;
        this.minlength = 300;
        this.min = '';
        this.max = '';
        this.value = null;
        this.formController = null;
        this.fontSize = 14;
        this.mask = null;
        this.textTransform = '';
        this.border = 'bottom';
        this.formControllerChange = new _angular_core__WEBPACK_IMPORTED_MODULE_3__["EventEmitter"]();
        this.valueChange = new _angular_core__WEBPACK_IMPORTED_MODULE_3__["EventEmitter"]();
        this.stylezz = {
            fontSize: null,
            borderBottom: null,
            borderTop: null,
            borderLeft: null,
            borderRight: null,
        };
        this.typeToogle = false;
        this.dataRef = new Date();
    }
    ngOnInit() {
        // this.valueChange.emit(this.value);
        if (this.formController) {
            this.value = this.formController.value;
        }
        //verificar se a cor enviada é uma cor valida ou uma variavel no sistema de variaveis de cores.
        if (!this.color.includes('#')) {
            this.color = 'var(--' + this.color + ')';
        }
        this.stylezz.fontSize = `${this.fontSize}px`;
        this.setBorder();
    }
    setBorder() {
        const borderColor = `1px solid ${this.color}`;
        switch (this.border) {
            case 'bottom':
                this.stylezz.borderBottom = borderColor;
                break;
            case 'top':
                this.stylezz.borderTop = borderColor;
                break;
            case 'right':
                this.stylezz.borderRight = borderColor;
                break;
            case 'left':
                this.stylezz.borderLeft = borderColor;
                break;
            case 'full':
                this.stylezz.borderBottom = borderColor;
                this.stylezz.borderTop = borderColor;
                this.stylezz.borderRight = borderColor;
                this.stylezz.borderLeft = borderColor;
                break;
            default:
                this.stylezz.borderBottom = this.border;
                this.stylezz.borderTop = this.border;
                this.stylezz.borderRight = this.border;
                this.stylezz.borderLeft = this.border;
                break;
        }
    }
    setForm() {
        if (this.formController) {
            this.formController.setValue(this.value);
            this.readonly = this.formController.disabled;
            this.validation.validate = this.formController.valid;
            this.formControllerChange.emit(this.formController);
            // this.formController.markAsTouched();
        }
    }
    emitVal() {
        this.transformText();
        this.makeValidations();
        this.setForm();
        this.valueChange.emit(this.value);
    }
    transformText() {
        if (this.textTransform) {
            let value = this.value;
            if (this.textTransform == 'uppercase') {
                this.value = value.toUpperCase();
            }
            else if (this.textTransform == 'lowercase') {
                this.value = value.toLowerCase();
            }
        }
    }
    makeValidations() {
        switch (this.type) {
            case 'mail':
                this.validation.validate = _models_constants_util_RegexUtils__WEBPACK_IMPORTED_MODULE_5__["RegexUtils"].testMail(this.value);
                this.validation.text = _models_constants_Messages__WEBPACK_IMPORTED_MODULE_4__["Messages"].INVALID_MAIL;
                break;
        }
    }
};
InputComponent.ctorParameters = () => [];
InputComponent.propDecorators = {
    label: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['label',] }],
    id: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['id',] }],
    background: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['background',] }],
    color: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['color',] }],
    showValidation: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['showValidation',] }],
    readonly: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['readonly',] }],
    required: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['required',] }],
    validation: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['validation',] }],
    type: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['type',] }],
    position: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['position',] }],
    maxlength: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['maxlength',] }],
    minlength: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['minlength',] }],
    min: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['min',] }],
    max: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['max',] }],
    value: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['value',] }],
    formController: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['formController',] }],
    fontSize: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['fontSize',] }],
    mask: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['mask',] }],
    textTransform: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['textTransform',] }],
    border: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['border',] }],
    formControllerChange: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Output"] }],
    valueChange: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Output"] }]
};
InputComponent = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-input',
        template: _raw_loader_input_component_html__WEBPACK_IMPORTED_MODULE_1__["default"],
        styles: [_input_component_scss__WEBPACK_IMPORTED_MODULE_2__["default"]]
    })
], InputComponent);



/***/ }),

/***/ "iO1G":
/*!**********************************************************************!*\
  !*** ./src/app/modules/shared/components/search/search.component.ts ***!
  \**********************************************************************/
/*! exports provided: SearchComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SearchComponent", function() { return SearchComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _raw_loader_search_component_html__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! raw-loader!./search.component.html */ "PhYU");
/* harmony import */ var _search_component_scss__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./search.component.scss */ "K1kB");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "fXoL");




let SearchComponent = class SearchComponent {
    constructor() {
        this.find = new _angular_core__WEBPACK_IMPORTED_MODULE_3__["EventEmitter"]();
    }
    ngOnInit() { }
    emitFind(value) {
        this.find.emit(value);
    }
};
SearchComponent.ctorParameters = () => [];
SearchComponent.propDecorators = {
    placeholder: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['placeholder',] }],
    find: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Output"] }]
};
SearchComponent = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-search',
        template: _raw_loader_search_component_html__WEBPACK_IMPORTED_MODULE_1__["default"],
        styles: [_search_component_scss__WEBPACK_IMPORTED_MODULE_2__["default"]]
    })
], SearchComponent);



/***/ }),

/***/ "j7Py":
/*!**************************************************************************!*\
  !*** ./src/app/modules/shared/components/icons/icon/icon.component.scss ***!
  \**************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJpY29uLmNvbXBvbmVudC5zY3NzIn0= */");

/***/ }),

/***/ "kImk":
/*!********************************************************************************!*\
  !*** ./src/app/modules/shared/components/icons/icon-map/icon-map.component.ts ***!
  \********************************************************************************/
/*! exports provided: IconMapComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "IconMapComponent", function() { return IconMapComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _raw_loader_icon_map_component_html__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! raw-loader!./icon-map.component.html */ "Sp+g");
/* harmony import */ var _icon_map_component_scss__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./icon-map.component.scss */ "uDnp");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "fXoL");




let IconMapComponent = class IconMapComponent {
    constructor() { }
    ngOnInit() {
    }
};
IconMapComponent.ctorParameters = () => [];
IconMapComponent = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-icon-map',
        template: _raw_loader_icon_map_component_html__WEBPACK_IMPORTED_MODULE_1__["default"],
        styles: [_icon_map_component_scss__WEBPACK_IMPORTED_MODULE_2__["default"]]
    })
], IconMapComponent);



/***/ }),

/***/ "kLfG":
/*!*****************************************************************************************************************************************!*\
  !*** ./node_modules/@ionic/core/dist/esm lazy ^\.\/.*\.entry\.js$ include: \.entry\.js$ exclude: \.system\.entry\.js$ namespace object ***!
  \*****************************************************************************************************************************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

var map = {
	"./ion-action-sheet.entry.js": [
		"dUtr",
		"common",
		0
	],
	"./ion-alert.entry.js": [
		"Q8AI",
		"common",
		1
	],
	"./ion-app_8.entry.js": [
		"hgI1",
		"common",
		2
	],
	"./ion-avatar_3.entry.js": [
		"CfoV",
		"common",
		3
	],
	"./ion-back-button.entry.js": [
		"Nt02",
		"common",
		4
	],
	"./ion-backdrop.entry.js": [
		"Q2Bp",
		5
	],
	"./ion-button_2.entry.js": [
		"0Pbj",
		"common",
		6
	],
	"./ion-card_5.entry.js": [
		"ydQj",
		"common",
		7
	],
	"./ion-checkbox.entry.js": [
		"4fMi",
		"common",
		8
	],
	"./ion-chip.entry.js": [
		"czK9",
		"common",
		9
	],
	"./ion-col_3.entry.js": [
		"/CAe",
		10
	],
	"./ion-datetime_3.entry.js": [
		"WgF3",
		"common",
		11
	],
	"./ion-fab_3.entry.js": [
		"uQcF",
		"common",
		12
	],
	"./ion-img.entry.js": [
		"wHD8",
		13
	],
	"./ion-infinite-scroll_2.entry.js": [
		"2lz6",
		14
	],
	"./ion-input.entry.js": [
		"ercB",
		"common",
		15
	],
	"./ion-item-option_3.entry.js": [
		"MGMP",
		"common",
		16
	],
	"./ion-item_8.entry.js": [
		"9bur",
		"common",
		17
	],
	"./ion-loading.entry.js": [
		"cABk",
		"common",
		18
	],
	"./ion-menu_3.entry.js": [
		"kyFE",
		"common",
		19
	],
	"./ion-modal.entry.js": [
		"TvZU",
		"common",
		20
	],
	"./ion-nav_2.entry.js": [
		"vnES",
		"common",
		21
	],
	"./ion-popover.entry.js": [
		"qCuA",
		"common",
		22
	],
	"./ion-progress-bar.entry.js": [
		"0tOe",
		"common",
		23
	],
	"./ion-radio_2.entry.js": [
		"h11V",
		"common",
		24
	],
	"./ion-range.entry.js": [
		"XGij",
		"common",
		25
	],
	"./ion-refresher_2.entry.js": [
		"nYbb",
		"common",
		26
	],
	"./ion-reorder_2.entry.js": [
		"smMY",
		"common",
		27
	],
	"./ion-ripple-effect.entry.js": [
		"STjf",
		28
	],
	"./ion-route_4.entry.js": [
		"k5eQ",
		"common",
		29
	],
	"./ion-searchbar.entry.js": [
		"OR5t",
		"common",
		30
	],
	"./ion-segment_2.entry.js": [
		"fSgp",
		"common",
		31
	],
	"./ion-select_3.entry.js": [
		"lfGF",
		"common",
		32
	],
	"./ion-slide_2.entry.js": [
		"5xYT",
		33
	],
	"./ion-spinner.entry.js": [
		"nI0H",
		"common",
		34
	],
	"./ion-split-pane.entry.js": [
		"NAQR",
		35
	],
	"./ion-tab-bar_2.entry.js": [
		"knkW",
		"common",
		36
	],
	"./ion-tab_2.entry.js": [
		"TpdJ",
		"common",
		37
	],
	"./ion-text.entry.js": [
		"ISmu",
		"common",
		38
	],
	"./ion-textarea.entry.js": [
		"U7LX",
		"common",
		39
	],
	"./ion-toast.entry.js": [
		"L3sA",
		"common",
		40
	],
	"./ion-toggle.entry.js": [
		"IUOf",
		"common",
		41
	],
	"./ion-virtual-scroll.entry.js": [
		"8Mb5",
		42
	]
};
function webpackAsyncContext(req) {
	if(!__webpack_require__.o(map, req)) {
		return Promise.resolve().then(function() {
			var e = new Error("Cannot find module '" + req + "'");
			e.code = 'MODULE_NOT_FOUND';
			throw e;
		});
	}

	var ids = map[req], id = ids[0];
	return Promise.all(ids.slice(1).map(__webpack_require__.e)).then(function() {
		return __webpack_require__(id);
	});
}
webpackAsyncContext.keys = function webpackAsyncContextKeys() {
	return Object.keys(map);
};
webpackAsyncContext.id = "kLfG";
module.exports = webpackAsyncContext;

/***/ }),

/***/ "sxQk":
/*!*********************************************************!*\
  !*** ./src/app/modules/shared/shared-routing.module.ts ***!
  \*********************************************************/
/*! exports provided: SharedPageRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "SharedPageRoutingModule", function() { return SharedPageRoutingModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "tyNb");



let SharedPageRoutingModule = class SharedPageRoutingModule {
};
SharedPageRoutingModule = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        imports: [],
        exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]],
    })
], SharedPageRoutingModule);



/***/ }),

/***/ "uDnp":
/*!**********************************************************************************!*\
  !*** ./src/app/modules/shared/components/icons/icon-map/icon-map.component.scss ***!
  \**********************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJpY29uLW1hcC5jb21wb25lbnQuc2NzcyJ9 */");

/***/ }),

/***/ "utrD":
/*!**********************************************************************!*\
  !*** ./src/app/modules/shared/components/input/input.component.scss ***!
  \**********************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("/** Ionic CSS Variables **/\n:root {\n  --primary: #005ca9;\n  --primary-strong: #1047df;\n  --primary-weak: #004c8c;\n  --secondary: #3dc2ff;\n  --secondary-strong: #36abe0;\n  --secondary-weak: #50c8ff;\n  --light: #ffffff;\n  --light-strong: #ffffff;\n  --light-weak: #f3f5f9;\n  --danger: #eb445a;\n  --danger-strong: #cf3c4f;\n  --danger-weak: #ed576b;\n  --gray: #92949c;\n  --gray-strong: #808289;\n  --gray-weak: #9d9fa6;\n  /** tertiary **/\n  --violet: #5260ff;\n  --violet-strong: #4854e0;\n  --violet-weak: #6370ff;\n  /** success **/\n  --success: #2dd36f;\n  --success-shade: #28ba62;\n  --success-tint: #42d77d;\n  /** warning **/\n  --warning: #ffc409;\n  --warning-shade: #e0ac08;\n  --warning-tint: #ffca22;\n  --alert: #e9e51d;\n  --alert-shade: #cac70f;\n  --alert-tint: #f5f258;\n  --text: #1f3033;\n  --dark: #1f3033;\n  --gradient-main: linear-gradient(to top, #005bea, #00c6fb 100%);\n  --gradient-primary: linear-gradient(to right, #4facfe, #00f2fe);\n  --gradient-header: linear-gradient(251.13deg, #00a2cd 24.32%, #0066a6 79.58%);\n  --ion-color-alert: var(--alert);\n  --ion-color-alert-rgb: 56, 128, 255;\n  --ion-color-alert-contrast: var(--light);\n  --ion-color-alert-contrast-rgb: 255, 255, 255;\n  --ion-color-alert-shade: var(--alert-strong);\n  --ion-color-alert-tint: var(--alert-weak);\n  /** primary **/\n  --ion-color-primary: var(--primary);\n  --ion-color-primary-rgb: 56, 128, 255;\n  --ion-color-primary-contrast: var(--light);\n  --ion-color-primary-contrast-rgb: 255, 255, 255;\n  --ion-color-primary-shade: var(--primary-strong);\n  --ion-color-primary-tint: var(--primary-weak);\n  /** secondary **/\n  --ion-color-secondary: var(--secondary);\n  --ion-color-secondary-rgb: 61, 194, 255;\n  --ion-color-secondary-contrast: var(--light);\n  --ion-color-secondary-contrast-rgb: 255, 255, 255;\n  --ion-color-secondary-shade: var(--secondary-strong);\n  --ion-color-secondary-tint: var(--secondary-weak);\n  /** tertiary **/\n  --ion-color-tertiary: var(--violet);\n  --ion-color-tertiary-rgb: 82, 96, 255;\n  --ion-color-tertiary-contrast: var(--light);\n  --ion-color-tertiary-contrast-rgb: 255, 255, 255;\n  --ion-color-tertiary-shade: var(--violet-strong);\n  --ion-color-tertiary-tint: var(--violet-weak);\n  /** success **/\n  --ion-color-success: var(--success);\n  --ion-color-success-rgb: 45, 211, 111;\n  --ion-color-success-contrast: var(--light);\n  --ion-color-success-contrast-rgb: 255, 255, 255;\n  --ion-color-success-shade: var(--success-strong);\n  --ion-color-success-tint: var(--success-weak);\n  /** warning **/\n  --ion-color-warning: var(--warning);\n  --ion-color-warning-rgb: 255, 196, 9;\n  --ion-color-warning-contrast: var(--dark);\n  --ion-color-warning-contrast-rgb: 0, 0, 0;\n  --ion-color-warning-shade: var(--warning-strong);\n  --ion-color-warning-tint: var(--warning-weak);\n  /** danger **/\n  --ion-color-danger: var(--red);\n  --ion-color-danger-rgb: 235, 68, 90;\n  --ion-color-danger-contrast: var(--light);\n  --ion-color-danger-contrast-rgb: 255, 255, 255;\n  --ion-color-danger-shade: var(--red-strong);\n  --ion-color-danger-tint: var(--red-weak);\n  /** dark **/\n  --ion-color-dark: var(--dark);\n  --ion-color-dark-rgb: 34, 36, 40;\n  --ion-color-dark-contrast: var(--light);\n  --ion-color-dark-contrast-rgb: 255, 255, 255;\n  --ion-color-dark-shade: var(--dark);\n  --ion-color-dark-tint: var(--dark);\n  /** medium **/\n  --ion-color-medium: var(--gray);\n  --ion-color-medium-rgb: 146, 148, 156;\n  --ion-color-medium-contrast: var(--light);\n  --ion-color-medium-contrast-rgb: 255, 255, 255;\n  --ion-color-medium-shade: var(--gray-strong);\n  --ion-color-medium-tint: var(--gray-weak);\n  /** light **/\n  --ion-color-light: var(--light);\n  --ion-color-light-rgb: 244, 245, 248;\n  --ion-color-light-contrast: var(--dark);\n  --ion-color-light-contrast-rgb: 0, 0, 0;\n  --ion-color-light-shade: var(--light-strong);\n  --ion-color-light-tint: var(--light-weak);\n}\nion-item {\n  color: var(--primary);\n}\nion-toggle {\n  margin-top: -25px;\n  margin-right: 5px;\n  width: 35px;\n  height: 15px;\n  border-radius: 10px;\n  border: 1px solid var(--secondary);\n  --handle-width: 15px;\n}\nion-toggle.toggle-checked {\n  border: 1px solid var(--light);\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIi4uLy4uLy4uLy4uLy4uLy4uLy4uLy4uLy4uLy4uLy4uL3RoZW1lL3ZhcmlhYmxlcy5zY3NzIiwiLi4vLi4vLi4vLi4vLi4vLi4vaW5wdXQuY29tcG9uZW50LnNjc3MiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IkFBR0EsMEJBQUE7QUFnQkE7RUFDRSxrQkFBQTtFQUNBLHlCQUFBO0VBQ0EsdUJBQUE7RUFFQSxvQkFBQTtFQUNBLDJCQUFBO0VBQ0EseUJBQUE7RUFFQSxnQkFBQTtFQUNBLHVCQUFBO0VBQ0EscUJBQUE7RUFFQSxpQkFBQTtFQUNBLHdCQUFBO0VBQ0Esc0JBQUE7RUFFQSxlQUFBO0VBQ0Esc0JBQUE7RUFDQSxvQkFBQTtFQUVBLGVBQUE7RUFDQSxpQkFBQTtFQUNBLHdCQUFBO0VBQ0Esc0JBQUE7RUFFQSxjQUFBO0VBQ0Esa0JBQUE7RUFDQSx3QkFBQTtFQUNBLHVCQUFBO0VBRUEsY0FBQTtFQUNBLGtCQUFBO0VBQ0Esd0JBQUE7RUFDQSx1QkFBQTtFQUVBLGdCQUFBO0VBQ0Esc0JBQUE7RUFDQSxxQkFBQTtFQUVBLGVBQUE7RUFDQSxlQUFBO0VBSUEsK0RBQUE7RUFDQSwrREFBQTtFQUNBLDZFQUFBO0VBRUEsK0JBQUE7RUFDQSxtQ0FBQTtFQUNBLHdDQUFBO0VBQ0EsNkNBQUE7RUFDQSw0Q0FBQTtFQUNBLHlDQUFBO0VBRUEsY0FBQTtFQUNBLG1DQUFBO0VBQ0EscUNBQUE7RUFDQSwwQ0FBQTtFQUNBLCtDQUFBO0VBQ0EsZ0RBQUE7RUFDQSw2Q0FBQTtFQUVBLGdCQUFBO0VBQ0EsdUNBQUE7RUFDQSx1Q0FBQTtFQUNBLDRDQUFBO0VBQ0EsaURBQUE7RUFDQSxvREFBQTtFQUNBLGlEQUFBO0VBRUEsZUFBQTtFQUNBLG1DQUFBO0VBQ0EscUNBQUE7RUFDQSwyQ0FBQTtFQUNBLGdEQUFBO0VBQ0EsZ0RBQUE7RUFDQSw2Q0FBQTtFQUVBLGNBQUE7RUFDQSxtQ0FBQTtFQUNBLHFDQUFBO0VBQ0EsMENBQUE7RUFDQSwrQ0FBQTtFQUNBLGdEQUFBO0VBQ0EsNkNBQUE7RUFFQSxjQUFBO0VBQ0EsbUNBQUE7RUFDQSxvQ0FBQTtFQUNBLHlDQUFBO0VBQ0EseUNBQUE7RUFDQSxnREFBQTtFQUNBLDZDQUFBO0VBRUEsYUFBQTtFQUNBLDhCQUFBO0VBQ0EsbUNBQUE7RUFDQSx5Q0FBQTtFQUNBLDhDQUFBO0VBQ0EsMkNBQUE7RUFDQSx3Q0FBQTtFQUVBLFdBQUE7RUFDQSw2QkFBQTtFQUNBLGdDQUFBO0VBQ0EsdUNBQUE7RUFDQSw0Q0FBQTtFQUNBLG1DQUFBO0VBQ0Esa0NBQUE7RUFFQSxhQUFBO0VBQ0EsK0JBQUE7RUFDQSxxQ0FBQTtFQUNBLHlDQUFBO0VBQ0EsOENBQUE7RUFDQSw0Q0FBQTtFQUNBLHlDQUFBO0VBRUEsWUFBQTtFQUNBLCtCQUFBO0VBQ0Esb0NBQUE7RUFDQSx1Q0FBQTtFQUNBLHVDQUFBO0VBQ0EsNENBQUE7RUFDQSx5Q0FBQTtBQ3ZDRjtBQXhHQTtFQUNFLHFCQUFBO0FBMkdGO0FBdkdBO0VBQ0UsaUJBQUE7RUFDQSxpQkFBQTtFQUNBLFdBQUE7RUFDQSxZQUFBO0VBQ0EsbUJBQUE7RUFDQSxrQ0FBQTtFQUNBLG9CQUFBO0FBMEdGO0FBdkdBO0VBQ0UsOEJBQUE7QUEwR0YiLCJmaWxlIjoiaW5wdXQuY29tcG9uZW50LnNjc3MiLCJzb3VyY2VzQ29udGVudCI6WyIvLyBJb25pYyBWYXJpYWJsZXMgYW5kIFRoZW1pbmcuIEZvciBtb3JlIGluZm8sIHBsZWFzZSBzZWU6XG4vLyBodHRwOi8vaW9uaWNmcmFtZXdvcmsuY29tL2RvY3MvdGhlbWluZy9cblxuLyoqIElvbmljIENTUyBWYXJpYWJsZXMgKiovXG4vLyBDT1JFUyBQUklOQ0lQQUlTXG5cbiRjb2xvcnM6IChcbiAgcHJpbWFyeTogIzAwNWNhOSxcbiAgc2Vjb25kYXJ5OiAjM2RjMmZmLFxuICBkYW5nZXI6ICNlYjQ0NWEsXG4gIGxpZ2h0OiAjZmZmZmZmLFxuICBkYXJrOiAjMWYzMDMzLFxuICBzdWNjZXNzOiAjMmRkMzZmLFxuICB3YXJubmluZzogI2ZmYzQwOSxcbiAgdmlvbGV0OiAjNTI2MGZmLFxuICBncmF5OiAjOTI5NDljLFxuICBhbGVydDogI2U5ZTUxZCxcbik7XG5cbjpyb290IHtcbiAgLS1wcmltYXJ5OiAjMDA1Y2E5O1xuICAtLXByaW1hcnktc3Ryb25nOiAjMTA0N2RmO1xuICAtLXByaW1hcnktd2VhazogIzAwNGM4YztcblxuICAtLXNlY29uZGFyeTogIzNkYzJmZjtcbiAgLS1zZWNvbmRhcnktc3Ryb25nOiAjMzZhYmUwO1xuICAtLXNlY29uZGFyeS13ZWFrOiAjNTBjOGZmO1xuXG4gIC0tbGlnaHQ6ICNmZmZmZmY7XG4gIC0tbGlnaHQtc3Ryb25nOiAjZmZmZmZmO1xuICAtLWxpZ2h0LXdlYWs6ICNmM2Y1Zjk7XG5cbiAgLS1kYW5nZXI6ICNlYjQ0NWE7XG4gIC0tZGFuZ2VyLXN0cm9uZzogI2NmM2M0ZjtcbiAgLS1kYW5nZXItd2VhazogI2VkNTc2YjtcblxuICAtLWdyYXk6ICM5Mjk0OWM7XG4gIC0tZ3JheS1zdHJvbmc6ICM4MDgyODk7XG4gIC0tZ3JheS13ZWFrOiAjOWQ5ZmE2O1xuXG4gIC8qKiB0ZXJ0aWFyeSAqKi9cbiAgLS12aW9sZXQ6ICM1MjYwZmY7XG4gIC0tdmlvbGV0LXN0cm9uZzogIzQ4NTRlMDtcbiAgLS12aW9sZXQtd2VhazogIzYzNzBmZjtcblxuICAvKiogc3VjY2VzcyAqKi9cbiAgLS1zdWNjZXNzOiAjMmRkMzZmO1xuICAtLXN1Y2Nlc3Mtc2hhZGU6ICMyOGJhNjI7XG4gIC0tc3VjY2Vzcy10aW50OiAjNDJkNzdkO1xuXG4gIC8qKiB3YXJuaW5nICoqL1xuICAtLXdhcm5pbmc6ICNmZmM0MDk7XG4gIC0td2FybmluZy1zaGFkZTogI2UwYWMwODtcbiAgLS13YXJuaW5nLXRpbnQ6ICNmZmNhMjI7XG5cbiAgLS1hbGVydDogI2U5ZTUxZDtcbiAgLS1hbGVydC1zaGFkZTogI2NhYzcwZjtcbiAgLS1hbGVydC10aW50OiAjZjVmMjU4O1xuXG4gIC0tdGV4dDogIzFmMzAzMztcbiAgLS1kYXJrOiAjMWYzMDMzO1xuXG4gIC8vIEdSQURJRU5URVMgLyogVzNDLCBJRTEwKywgRkYxNissIENocm9tZTI2KywgT3BlcmExMissIFNhZmFyaTcrICovXG5cbiAgLS1ncmFkaWVudC1tYWluOiBsaW5lYXItZ3JhZGllbnQodG8gdG9wLCAjMDA1YmVhLCAjMDBjNmZiIDEwMCUpO1xuICAtLWdyYWRpZW50LXByaW1hcnk6IGxpbmVhci1ncmFkaWVudCh0byByaWdodCwgIzRmYWNmZSwgIzAwZjJmZSk7XG4gIC0tZ3JhZGllbnQtaGVhZGVyOiBsaW5lYXItZ3JhZGllbnQoMjUxLjEzZGVnLCAjMDBhMmNkIDI0LjMyJSwgIzAwNjZhNiA3OS41OCUpO1xuXG4gIC0taW9uLWNvbG9yLWFsZXJ0OiB2YXIoLS1hbGVydCk7XG4gIC0taW9uLWNvbG9yLWFsZXJ0LXJnYjogNTYsIDEyOCwgMjU1O1xuICAtLWlvbi1jb2xvci1hbGVydC1jb250cmFzdDogdmFyKC0tbGlnaHQpO1xuICAtLWlvbi1jb2xvci1hbGVydC1jb250cmFzdC1yZ2I6IDI1NSwgMjU1LCAyNTU7XG4gIC0taW9uLWNvbG9yLWFsZXJ0LXNoYWRlOiB2YXIoLS1hbGVydC1zdHJvbmcpO1xuICAtLWlvbi1jb2xvci1hbGVydC10aW50OiB2YXIoLS1hbGVydC13ZWFrKTtcblxuICAvKiogcHJpbWFyeSAqKi9cbiAgLS1pb24tY29sb3ItcHJpbWFyeTogdmFyKC0tcHJpbWFyeSk7XG4gIC0taW9uLWNvbG9yLXByaW1hcnktcmdiOiA1NiwgMTI4LCAyNTU7XG4gIC0taW9uLWNvbG9yLXByaW1hcnktY29udHJhc3Q6IHZhcigtLWxpZ2h0KTtcbiAgLS1pb24tY29sb3ItcHJpbWFyeS1jb250cmFzdC1yZ2I6IDI1NSwgMjU1LCAyNTU7XG4gIC0taW9uLWNvbG9yLXByaW1hcnktc2hhZGU6IHZhcigtLXByaW1hcnktc3Ryb25nKTtcbiAgLS1pb24tY29sb3ItcHJpbWFyeS10aW50OiB2YXIoLS1wcmltYXJ5LXdlYWspO1xuXG4gIC8qKiBzZWNvbmRhcnkgKiovXG4gIC0taW9uLWNvbG9yLXNlY29uZGFyeTogdmFyKC0tc2Vjb25kYXJ5KTtcbiAgLS1pb24tY29sb3Itc2Vjb25kYXJ5LXJnYjogNjEsIDE5NCwgMjU1O1xuICAtLWlvbi1jb2xvci1zZWNvbmRhcnktY29udHJhc3Q6IHZhcigtLWxpZ2h0KTtcbiAgLS1pb24tY29sb3Itc2Vjb25kYXJ5LWNvbnRyYXN0LXJnYjogMjU1LCAyNTUsIDI1NTtcbiAgLS1pb24tY29sb3Itc2Vjb25kYXJ5LXNoYWRlOiB2YXIoLS1zZWNvbmRhcnktc3Ryb25nKTtcbiAgLS1pb24tY29sb3Itc2Vjb25kYXJ5LXRpbnQ6IHZhcigtLXNlY29uZGFyeS13ZWFrKTtcblxuICAvKiogdGVydGlhcnkgKiovXG4gIC0taW9uLWNvbG9yLXRlcnRpYXJ5OiB2YXIoLS12aW9sZXQpO1xuICAtLWlvbi1jb2xvci10ZXJ0aWFyeS1yZ2I6IDgyLCA5NiwgMjU1O1xuICAtLWlvbi1jb2xvci10ZXJ0aWFyeS1jb250cmFzdDogdmFyKC0tbGlnaHQpO1xuICAtLWlvbi1jb2xvci10ZXJ0aWFyeS1jb250cmFzdC1yZ2I6IDI1NSwgMjU1LCAyNTU7XG4gIC0taW9uLWNvbG9yLXRlcnRpYXJ5LXNoYWRlOiB2YXIoLS12aW9sZXQtc3Ryb25nKTtcbiAgLS1pb24tY29sb3ItdGVydGlhcnktdGludDogdmFyKC0tdmlvbGV0LXdlYWspO1xuXG4gIC8qKiBzdWNjZXNzICoqL1xuICAtLWlvbi1jb2xvci1zdWNjZXNzOiB2YXIoLS1zdWNjZXNzKTtcbiAgLS1pb24tY29sb3Itc3VjY2Vzcy1yZ2I6IDQ1LCAyMTEsIDExMTtcbiAgLS1pb24tY29sb3Itc3VjY2Vzcy1jb250cmFzdDogdmFyKC0tbGlnaHQpO1xuICAtLWlvbi1jb2xvci1zdWNjZXNzLWNvbnRyYXN0LXJnYjogMjU1LCAyNTUsIDI1NTtcbiAgLS1pb24tY29sb3Itc3VjY2Vzcy1zaGFkZTogdmFyKC0tc3VjY2Vzcy1zdHJvbmcpO1xuICAtLWlvbi1jb2xvci1zdWNjZXNzLXRpbnQ6IHZhcigtLXN1Y2Nlc3Mtd2Vhayk7XG5cbiAgLyoqIHdhcm5pbmcgKiovXG4gIC0taW9uLWNvbG9yLXdhcm5pbmc6IHZhcigtLXdhcm5pbmcpO1xuICAtLWlvbi1jb2xvci13YXJuaW5nLXJnYjogMjU1LCAxOTYsIDk7XG4gIC0taW9uLWNvbG9yLXdhcm5pbmctY29udHJhc3Q6IHZhcigtLWRhcmspO1xuICAtLWlvbi1jb2xvci13YXJuaW5nLWNvbnRyYXN0LXJnYjogMCwgMCwgMDtcbiAgLS1pb24tY29sb3Itd2FybmluZy1zaGFkZTogdmFyKC0td2FybmluZy1zdHJvbmcpO1xuICAtLWlvbi1jb2xvci13YXJuaW5nLXRpbnQ6IHZhcigtLXdhcm5pbmctd2Vhayk7XG5cbiAgLyoqIGRhbmdlciAqKi9cbiAgLS1pb24tY29sb3ItZGFuZ2VyOiB2YXIoLS1yZWQpO1xuICAtLWlvbi1jb2xvci1kYW5nZXItcmdiOiAyMzUsIDY4LCA5MDtcbiAgLS1pb24tY29sb3ItZGFuZ2VyLWNvbnRyYXN0OiB2YXIoLS1saWdodCk7XG4gIC0taW9uLWNvbG9yLWRhbmdlci1jb250cmFzdC1yZ2I6IDI1NSwgMjU1LCAyNTU7XG4gIC0taW9uLWNvbG9yLWRhbmdlci1zaGFkZTogdmFyKC0tcmVkLXN0cm9uZyk7XG4gIC0taW9uLWNvbG9yLWRhbmdlci10aW50OiB2YXIoLS1yZWQtd2Vhayk7XG5cbiAgLyoqIGRhcmsgKiovXG4gIC0taW9uLWNvbG9yLWRhcms6IHZhcigtLWRhcmspO1xuICAtLWlvbi1jb2xvci1kYXJrLXJnYjogMzQsIDM2LCA0MDtcbiAgLS1pb24tY29sb3ItZGFyay1jb250cmFzdDogdmFyKC0tbGlnaHQpO1xuICAtLWlvbi1jb2xvci1kYXJrLWNvbnRyYXN0LXJnYjogMjU1LCAyNTUsIDI1NTtcbiAgLS1pb24tY29sb3ItZGFyay1zaGFkZTogdmFyKC0tZGFyayk7XG4gIC0taW9uLWNvbG9yLWRhcmstdGludDogdmFyKC0tZGFyayk7XG5cbiAgLyoqIG1lZGl1bSAqKi9cbiAgLS1pb24tY29sb3ItbWVkaXVtOiB2YXIoLS1ncmF5KTtcbiAgLS1pb24tY29sb3ItbWVkaXVtLXJnYjogMTQ2LCAxNDgsIDE1NjtcbiAgLS1pb24tY29sb3ItbWVkaXVtLWNvbnRyYXN0OiB2YXIoLS1saWdodCk7XG4gIC0taW9uLWNvbG9yLW1lZGl1bS1jb250cmFzdC1yZ2I6IDI1NSwgMjU1LCAyNTU7XG4gIC0taW9uLWNvbG9yLW1lZGl1bS1zaGFkZTogdmFyKC0tZ3JheS1zdHJvbmcpO1xuICAtLWlvbi1jb2xvci1tZWRpdW0tdGludDogdmFyKC0tZ3JheS13ZWFrKTtcblxuICAvKiogbGlnaHQgKiovXG4gIC0taW9uLWNvbG9yLWxpZ2h0OiB2YXIoLS1saWdodCk7XG4gIC0taW9uLWNvbG9yLWxpZ2h0LXJnYjogMjQ0LCAyNDUsIDI0ODtcbiAgLS1pb24tY29sb3ItbGlnaHQtY29udHJhc3Q6IHZhcigtLWRhcmspO1xuICAtLWlvbi1jb2xvci1saWdodC1jb250cmFzdC1yZ2I6IDAsIDAsIDA7XG4gIC0taW9uLWNvbG9yLWxpZ2h0LXNoYWRlOiB2YXIoLS1saWdodC1zdHJvbmcpO1xuICAtLWlvbi1jb2xvci1saWdodC10aW50OiB2YXIoLS1saWdodC13ZWFrKTtcbn1cbiIsIkBpbXBvcnQgXCIuLi8uLi8uLi8uLi8uLi90aGVtZS92YXJpYWJsZXMuc2Nzc1wiO1xuXG5pb24taXRlbSB7XG4gIGNvbG9yOiB2YXIoLS1wcmltYXJ5KTtcbiAgLy8gYm9yZGVyOiAxcHggc29saWQgYmxhY2sgIWltcG9ydGFudDtcbn1cblxuaW9uLXRvZ2dsZSB7XG4gIG1hcmdpbi10b3A6IC0yNXB4O1xuICBtYXJnaW4tcmlnaHQ6IDVweDtcbiAgd2lkdGg6IDM1cHg7XG4gIGhlaWdodDogMTVweDtcbiAgYm9yZGVyLXJhZGl1czogMTBweDtcbiAgYm9yZGVyOiAxcHggc29saWQgdmFyKC0tc2Vjb25kYXJ5KTtcbiAgLS1oYW5kbGUtd2lkdGg6IDE1cHg7XG59XG5cbmlvbi10b2dnbGUudG9nZ2xlLWNoZWNrZWQge1xuICBib3JkZXI6IDFweCBzb2xpZCB2YXIoLS1saWdodCk7XG59XG4iXX0= */");

/***/ }),

/***/ "vY5A":
/*!***************************************!*\
  !*** ./src/app/app-routing.module.ts ***!
  \***************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/router */ "tyNb");
/* harmony import */ var _modules_shared_models_enums_AppRoutesEnum__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./modules/shared/models/enums/AppRoutesEnum */ "c6vd");




const routes = [
    {
        path: _modules_shared_models_enums_AppRoutesEnum__WEBPACK_IMPORTED_MODULE_3__["AppRoutesEnum"].NONE,
        redirectTo: _modules_shared_models_enums_AppRoutesEnum__WEBPACK_IMPORTED_MODULE_3__["AppRoutesEnum"].SECURITY,
        pathMatch: _modules_shared_models_enums_AppRoutesEnum__WEBPACK_IMPORTED_MODULE_3__["AppRoutesEnum"].FULL,
    },
    {
        path: _modules_shared_models_enums_AppRoutesEnum__WEBPACK_IMPORTED_MODULE_3__["AppRoutesEnum"].HOME,
        loadChildren: () => Promise.all(/*! import() | modules-home-home-module */[__webpack_require__.e("common"), __webpack_require__.e("modules-home-home-module")]).then(__webpack_require__.bind(null, /*! ./modules/home/home.module */ "iydT")).then((m) => m.HomePageModule),
    },
    {
        path: _modules_shared_models_enums_AppRoutesEnum__WEBPACK_IMPORTED_MODULE_3__["AppRoutesEnum"].SECURITY,
        loadChildren: () => __webpack_require__.e(/*! import() | modules-security-security-module */ "modules-security-security-module").then(__webpack_require__.bind(null, /*! ./modules/security/security.module */ "t5c3")).then((m) => m.SecurityPageModule),
    },
    {
        path: _modules_shared_models_enums_AppRoutesEnum__WEBPACK_IMPORTED_MODULE_3__["AppRoutesEnum"].REGISTER,
        loadChildren: () => Promise.all(/*! import() | modules-register-register-module */[__webpack_require__.e("common"), __webpack_require__.e("modules-register-register-module")]).then(__webpack_require__.bind(null, /*! ./modules/register/register.module */ "CebT")).then((m) => m.RegisterPageModule),
    },
];
let AppRoutingModule = class AppRoutingModule {
};
AppRoutingModule = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
        imports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"].forRoot(routes)],
        exports: [_angular_router__WEBPACK_IMPORTED_MODULE_2__["RouterModule"]],
    })
], AppRoutingModule);



/***/ }),

/***/ "vkP1":
/*!******************************************************************!*\
  !*** ./src/app/modules/shared/components/img/img.component.scss ***!
  \******************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJpbWcuY29tcG9uZW50LnNjc3MifQ== */");

/***/ }),

/***/ "wB1E":
/*!**************************************************************************!*\
  !*** ./src/app/modules/shared/components/text-msg/text-msg.component.ts ***!
  \**************************************************************************/
/*! exports provided: TextMsgComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "TextMsgComponent", function() { return TextMsgComponent; });
/* harmony import */ var tslib__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! tslib */ "mrSG");
/* harmony import */ var _raw_loader_text_msg_component_html__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! raw-loader!./text-msg.component.html */ "yGus");
/* harmony import */ var _text_msg_component_scss__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./text-msg.component.scss */ "84Fk");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/core */ "fXoL");




let TextMsgComponent = class TextMsgComponent {
    constructor() {
        this.validated = true;
        this.fontSize = 12;
    }
    ngOnInit() {
        switch (this.type) {
            case 'success':
                this.clazz = 'success';
                break;
            case 'warning':
                this.clazz = 'warning';
                break;
            case 'danger':
                this.clazz = 'danger';
                break;
        }
    }
};
TextMsgComponent.ctorParameters = () => [];
TextMsgComponent.propDecorators = {
    validated: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['validated',] }],
    fontSize: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['fontSize',] }],
    text: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['text',] }],
    type: [{ type: _angular_core__WEBPACK_IMPORTED_MODULE_3__["Input"], args: ['type',] }]
};
TextMsgComponent = Object(tslib__WEBPACK_IMPORTED_MODULE_0__["__decorate"])([
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_3__["Component"])({
        selector: 'app-text-msg',
        template: _raw_loader_text_msg_component_html__WEBPACK_IMPORTED_MODULE_1__["default"],
        styles: [_text_msg_component_scss__WEBPACK_IMPORTED_MODULE_2__["default"]]
    })
], TextMsgComponent);



/***/ }),

/***/ "wTr2":
/*!*************************************************************!*\
  !*** ./src/app/modules/shared/models/enums/AppIconsEnum.ts ***!
  \*************************************************************/
/*! exports provided: AppIconsEnum */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppIconsEnum", function() { return AppIconsEnum; });
var AppIconsEnum;
(function (AppIconsEnum) {
    AppIconsEnum["AESTHETICS"] = "aesthetics";
    AppIconsEnum["ANGLE_DOWN"] = "angle-down";
    AppIconsEnum["ANGLE_LEFT"] = "angle-left";
    AppIconsEnum["ANGLE_UP"] = "angle-up";
    AppIconsEnum["ANGLE_RIGHT"] = "angle-right";
    AppIconsEnum["BAD_HAND"] = "bad-hand";
    AppIconsEnum["CALENDAR"] = "calendar";
    AppIconsEnum["CIRCLE_CLOSE"] = "circle-close";
    AppIconsEnum["CIRCLE_DENIED"] = "circle-denied";
    AppIconsEnum["CIRCLE_SUCCESS"] = "circle-success";
    AppIconsEnum["CIRCLE_WARNING"] = "circle-warning";
    AppIconsEnum["COMMENTS"] = "comments";
    AppIconsEnum["GROUP"] = "group";
    AppIconsEnum["HEART"] = "heart";
    AppIconsEnum["INBOX"] = "inbox";
    AppIconsEnum["LOCATION"] = "location";
    AppIconsEnum["LOG_OUT"] = "logout";
    AppIconsEnum["MAN"] = "man";
    AppIconsEnum["NICE_HAND"] = "nice-hand";
    AppIconsEnum["NOTIFICATION_ACTIVE"] = "notification-active";
    AppIconsEnum["NOTIFICATION"] = "notification";
    AppIconsEnum["PAPER"] = "paper";
    AppIconsEnum["SEARCH"] = "search";
    AppIconsEnum["USER"] = "user";
    AppIconsEnum["TRAINE"] = "traine";
    AppIconsEnum["WOMAN"] = "woman";
})(AppIconsEnum || (AppIconsEnum = {}));


/***/ }),

/***/ "yGus":
/*!******************************************************************************************************************!*\
  !*** ./node_modules/raw-loader/dist/cjs.js!./src/app/modules/shared/components/text-msg/text-msg.component.html ***!
  \******************************************************************************************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("<small\n  *ngIf=\"!validated\"\n  [ngStyle]=\"{ fontSize: fontSize + 'px' }\"\n  [class]=\"clazz\"\n  >{{ text }}</small\n>\n");

/***/ }),

/***/ "ynWL":
/*!************************************!*\
  !*** ./src/app/app.component.scss ***!
  \************************************/
/*! exports provided: default */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony default export */ __webpack_exports__["default"] = ("/** Ionic CSS Variables **/\n:root {\n  --primary: #005ca9;\n  --primary-strong: #1047df;\n  --primary-weak: #004c8c;\n  --secondary: #3dc2ff;\n  --secondary-strong: #36abe0;\n  --secondary-weak: #50c8ff;\n  --light: #ffffff;\n  --light-strong: #ffffff;\n  --light-weak: #f3f5f9;\n  --danger: #eb445a;\n  --danger-strong: #cf3c4f;\n  --danger-weak: #ed576b;\n  --gray: #92949c;\n  --gray-strong: #808289;\n  --gray-weak: #9d9fa6;\n  /** tertiary **/\n  --violet: #5260ff;\n  --violet-strong: #4854e0;\n  --violet-weak: #6370ff;\n  /** success **/\n  --success: #2dd36f;\n  --success-shade: #28ba62;\n  --success-tint: #42d77d;\n  /** warning **/\n  --warning: #ffc409;\n  --warning-shade: #e0ac08;\n  --warning-tint: #ffca22;\n  --alert: #e9e51d;\n  --alert-shade: #cac70f;\n  --alert-tint: #f5f258;\n  --text: #1f3033;\n  --dark: #1f3033;\n  --gradient-main: linear-gradient(to top, #005bea, #00c6fb 100%);\n  --gradient-primary: linear-gradient(to right, #4facfe, #00f2fe);\n  --gradient-header: linear-gradient(251.13deg, #00a2cd 24.32%, #0066a6 79.58%);\n  --ion-color-alert: var(--alert);\n  --ion-color-alert-rgb: 56, 128, 255;\n  --ion-color-alert-contrast: var(--light);\n  --ion-color-alert-contrast-rgb: 255, 255, 255;\n  --ion-color-alert-shade: var(--alert-strong);\n  --ion-color-alert-tint: var(--alert-weak);\n  /** primary **/\n  --ion-color-primary: var(--primary);\n  --ion-color-primary-rgb: 56, 128, 255;\n  --ion-color-primary-contrast: var(--light);\n  --ion-color-primary-contrast-rgb: 255, 255, 255;\n  --ion-color-primary-shade: var(--primary-strong);\n  --ion-color-primary-tint: var(--primary-weak);\n  /** secondary **/\n  --ion-color-secondary: var(--secondary);\n  --ion-color-secondary-rgb: 61, 194, 255;\n  --ion-color-secondary-contrast: var(--light);\n  --ion-color-secondary-contrast-rgb: 255, 255, 255;\n  --ion-color-secondary-shade: var(--secondary-strong);\n  --ion-color-secondary-tint: var(--secondary-weak);\n  /** tertiary **/\n  --ion-color-tertiary: var(--violet);\n  --ion-color-tertiary-rgb: 82, 96, 255;\n  --ion-color-tertiary-contrast: var(--light);\n  --ion-color-tertiary-contrast-rgb: 255, 255, 255;\n  --ion-color-tertiary-shade: var(--violet-strong);\n  --ion-color-tertiary-tint: var(--violet-weak);\n  /** success **/\n  --ion-color-success: var(--success);\n  --ion-color-success-rgb: 45, 211, 111;\n  --ion-color-success-contrast: var(--light);\n  --ion-color-success-contrast-rgb: 255, 255, 255;\n  --ion-color-success-shade: var(--success-strong);\n  --ion-color-success-tint: var(--success-weak);\n  /** warning **/\n  --ion-color-warning: var(--warning);\n  --ion-color-warning-rgb: 255, 196, 9;\n  --ion-color-warning-contrast: var(--dark);\n  --ion-color-warning-contrast-rgb: 0, 0, 0;\n  --ion-color-warning-shade: var(--warning-strong);\n  --ion-color-warning-tint: var(--warning-weak);\n  /** danger **/\n  --ion-color-danger: var(--red);\n  --ion-color-danger-rgb: 235, 68, 90;\n  --ion-color-danger-contrast: var(--light);\n  --ion-color-danger-contrast-rgb: 255, 255, 255;\n  --ion-color-danger-shade: var(--red-strong);\n  --ion-color-danger-tint: var(--red-weak);\n  /** dark **/\n  --ion-color-dark: var(--dark);\n  --ion-color-dark-rgb: 34, 36, 40;\n  --ion-color-dark-contrast: var(--light);\n  --ion-color-dark-contrast-rgb: 255, 255, 255;\n  --ion-color-dark-shade: var(--dark);\n  --ion-color-dark-tint: var(--dark);\n  /** medium **/\n  --ion-color-medium: var(--gray);\n  --ion-color-medium-rgb: 146, 148, 156;\n  --ion-color-medium-contrast: var(--light);\n  --ion-color-medium-contrast-rgb: 255, 255, 255;\n  --ion-color-medium-shade: var(--gray-strong);\n  --ion-color-medium-tint: var(--gray-weak);\n  /** light **/\n  --ion-color-light: var(--light);\n  --ion-color-light-rgb: 244, 245, 248;\n  --ion-color-light-contrast: var(--dark);\n  --ion-color-light-contrast-rgb: 0, 0, 0;\n  --ion-color-light-shade: var(--light-strong);\n  --ion-color-light-tint: var(--light-weak);\n}\nion-menu ion-list {\n  background: var(--primary);\n}\nion-label {\n  color: var(--light);\n}\nion-menu.md ion-content {\n  --padding-start: 8px;\n  --padding-end: 8px;\n  --padding-top: 20px;\n  --padding-bottom: 20px;\n}\nion-menu.md ion-list {\n  padding: 20px 0;\n}\nion-menu.md ion-note {\n  margin-bottom: 30px;\n}\nion-menu.md ion-list-header,\nion-menu.md ion-note {\n  padding-left: 10px;\n}\nion-menu.md ion-list#inbox-list {\n  border-bottom: 1px solid var(--ion-color-step-150, #d7d8da);\n}\nion-menu.md ion-list#inbox-list ion-list-header {\n  font-size: 22px;\n  font-weight: 600;\n  min-height: 20px;\n}\nion-menu.md ion-list#labels-list ion-list-header {\n  font-size: 16px;\n  margin-bottom: 18px;\n  color: #757575;\n  min-height: 26px;\n}\nion-menu.md ion-item {\n  --padding-start: 10px;\n  --padding-end: 10px;\n  border-radius: 4px;\n}\nion-menu.md ion-item.selected {\n  --background: rgba(var(--ion-color-primary-rgb), 0.14);\n}\nion-menu.md ion-item.selected ion-icon {\n  color: var(--ion-color-primary);\n}\nion-menu.md ion-item ion-icon {\n  color: #616e7e;\n}\nion-menu.md ion-item ion-label {\n  font-weight: 500;\n}\nion-menu.ios ion-content {\n  --padding-bottom: 20px;\n}\nion-menu.ios ion-list {\n  padding: 20px 0 0 0;\n}\nion-menu.ios ion-note {\n  line-height: 24px;\n  margin-bottom: 20px;\n}\nion-menu.ios ion-item {\n  --padding-start: 16px;\n  --padding-end: 16px;\n  --min-height: 50px;\n}\nion-menu.ios ion-item.selected ion-icon {\n  color: var(--ion-color-primary);\n}\nion-menu.ios ion-item ion-icon {\n  font-size: 24px;\n  color: #73849a;\n}\nion-menu.ios ion-list#labels-list ion-list-header {\n  margin-bottom: 8px;\n}\nion-menu.ios ion-list-header,\nion-menu.ios ion-note {\n  padding-left: 16px;\n  padding-right: 16px;\n}\nion-menu.ios ion-note {\n  margin-bottom: 8px;\n}\nion-note {\n  display: inline-block;\n  font-size: 16px;\n  color: var(--ion-color-medium-shade);\n}\nion-item.selected {\n  --color: var(--ion-color-primary);\n}\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIi4uLy4uLy4uL3RoZW1lL3ZhcmlhYmxlcy5zY3NzIiwiLi4vLi4vYXBwLmNvbXBvbmVudC5zY3NzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUdBLDBCQUFBO0FBZ0JBO0VBQ0Usa0JBQUE7RUFDQSx5QkFBQTtFQUNBLHVCQUFBO0VBRUEsb0JBQUE7RUFDQSwyQkFBQTtFQUNBLHlCQUFBO0VBRUEsZ0JBQUE7RUFDQSx1QkFBQTtFQUNBLHFCQUFBO0VBRUEsaUJBQUE7RUFDQSx3QkFBQTtFQUNBLHNCQUFBO0VBRUEsZUFBQTtFQUNBLHNCQUFBO0VBQ0Esb0JBQUE7RUFFQSxlQUFBO0VBQ0EsaUJBQUE7RUFDQSx3QkFBQTtFQUNBLHNCQUFBO0VBRUEsY0FBQTtFQUNBLGtCQUFBO0VBQ0Esd0JBQUE7RUFDQSx1QkFBQTtFQUVBLGNBQUE7RUFDQSxrQkFBQTtFQUNBLHdCQUFBO0VBQ0EsdUJBQUE7RUFFQSxnQkFBQTtFQUNBLHNCQUFBO0VBQ0EscUJBQUE7RUFFQSxlQUFBO0VBQ0EsZUFBQTtFQUlBLCtEQUFBO0VBQ0EsK0RBQUE7RUFDQSw2RUFBQTtFQUVBLCtCQUFBO0VBQ0EsbUNBQUE7RUFDQSx3Q0FBQTtFQUNBLDZDQUFBO0VBQ0EsNENBQUE7RUFDQSx5Q0FBQTtFQUVBLGNBQUE7RUFDQSxtQ0FBQTtFQUNBLHFDQUFBO0VBQ0EsMENBQUE7RUFDQSwrQ0FBQTtFQUNBLGdEQUFBO0VBQ0EsNkNBQUE7RUFFQSxnQkFBQTtFQUNBLHVDQUFBO0VBQ0EsdUNBQUE7RUFDQSw0Q0FBQTtFQUNBLGlEQUFBO0VBQ0Esb0RBQUE7RUFDQSxpREFBQTtFQUVBLGVBQUE7RUFDQSxtQ0FBQTtFQUNBLHFDQUFBO0VBQ0EsMkNBQUE7RUFDQSxnREFBQTtFQUNBLGdEQUFBO0VBQ0EsNkNBQUE7RUFFQSxjQUFBO0VBQ0EsbUNBQUE7RUFDQSxxQ0FBQTtFQUNBLDBDQUFBO0VBQ0EsK0NBQUE7RUFDQSxnREFBQTtFQUNBLDZDQUFBO0VBRUEsY0FBQTtFQUNBLG1DQUFBO0VBQ0Esb0NBQUE7RUFDQSx5Q0FBQTtFQUNBLHlDQUFBO0VBQ0EsZ0RBQUE7RUFDQSw2Q0FBQTtFQUVBLGFBQUE7RUFDQSw4QkFBQTtFQUNBLG1DQUFBO0VBQ0EseUNBQUE7RUFDQSw4Q0FBQTtFQUNBLDJDQUFBO0VBQ0Esd0NBQUE7RUFFQSxXQUFBO0VBQ0EsNkJBQUE7RUFDQSxnQ0FBQTtFQUNBLHVDQUFBO0VBQ0EsNENBQUE7RUFDQSxtQ0FBQTtFQUNBLGtDQUFBO0VBRUEsYUFBQTtFQUNBLCtCQUFBO0VBQ0EscUNBQUE7RUFDQSx5Q0FBQTtFQUNBLDhDQUFBO0VBQ0EsNENBQUE7RUFDQSx5Q0FBQTtFQUVBLFlBQUE7RUFDQSwrQkFBQTtFQUNBLG9DQUFBO0VBQ0EsdUNBQUE7RUFDQSx1Q0FBQTtFQUNBLDRDQUFBO0VBQ0EseUNBQUE7QUN2Q0Y7QUF0R0U7RUFDRSwwQkFBQTtBQXlHSjtBQXJHQTtFQUNFLG1CQUFBO0FBd0dGO0FBckdBO0VBQ0Usb0JBQUE7RUFDQSxrQkFBQTtFQUNBLG1CQUFBO0VBQ0Esc0JBQUE7QUF3R0Y7QUFyR0E7RUFDRSxlQUFBO0FBd0dGO0FBckdBO0VBQ0UsbUJBQUE7QUF3R0Y7QUFyR0E7O0VBRUUsa0JBQUE7QUF3R0Y7QUFyR0E7RUFDRSwyREFBQTtBQXdHRjtBQXJHQTtFQUNFLGVBQUE7RUFDQSxnQkFBQTtFQUVBLGdCQUFBO0FBdUdGO0FBcEdBO0VBQ0UsZUFBQTtFQUVBLG1CQUFBO0VBRUEsY0FBQTtFQUVBLGdCQUFBO0FBb0dGO0FBakdBO0VBQ0UscUJBQUE7RUFDQSxtQkFBQTtFQUNBLGtCQUFBO0FBb0dGO0FBakdBO0VBQ0Usc0RBQUE7QUFvR0Y7QUFqR0E7RUFDRSwrQkFBQTtBQW9HRjtBQWpHQTtFQUNFLGNBQUE7QUFvR0Y7QUFqR0E7RUFDRSxnQkFBQTtBQW9HRjtBQWpHQTtFQUNFLHNCQUFBO0FBb0dGO0FBakdBO0VBQ0UsbUJBQUE7QUFvR0Y7QUFqR0E7RUFDRSxpQkFBQTtFQUNBLG1CQUFBO0FBb0dGO0FBakdBO0VBQ0UscUJBQUE7RUFDQSxtQkFBQTtFQUNBLGtCQUFBO0FBb0dGO0FBakdBO0VBQ0UsK0JBQUE7QUFvR0Y7QUFqR0E7RUFDRSxlQUFBO0VBQ0EsY0FBQTtBQW9HRjtBQWpHQTtFQUNFLGtCQUFBO0FBb0dGO0FBakdBOztFQUVFLGtCQUFBO0VBQ0EsbUJBQUE7QUFvR0Y7QUFqR0E7RUFDRSxrQkFBQTtBQW9HRjtBQWpHQTtFQUNFLHFCQUFBO0VBQ0EsZUFBQTtFQUVBLG9DQUFBO0FBbUdGO0FBaEdBO0VBQ0UsaUNBQUE7QUFtR0YiLCJmaWxlIjoiYXBwLmNvbXBvbmVudC5zY3NzIiwic291cmNlc0NvbnRlbnQiOlsiLy8gSW9uaWMgVmFyaWFibGVzIGFuZCBUaGVtaW5nLiBGb3IgbW9yZSBpbmZvLCBwbGVhc2Ugc2VlOlxuLy8gaHR0cDovL2lvbmljZnJhbWV3b3JrLmNvbS9kb2NzL3RoZW1pbmcvXG5cbi8qKiBJb25pYyBDU1MgVmFyaWFibGVzICoqL1xuLy8gQ09SRVMgUFJJTkNJUEFJU1xuXG4kY29sb3JzOiAoXG4gIHByaW1hcnk6ICMwMDVjYTksXG4gIHNlY29uZGFyeTogIzNkYzJmZixcbiAgZGFuZ2VyOiAjZWI0NDVhLFxuICBsaWdodDogI2ZmZmZmZixcbiAgZGFyazogIzFmMzAzMyxcbiAgc3VjY2VzczogIzJkZDM2ZixcbiAgd2Fybm5pbmc6ICNmZmM0MDksXG4gIHZpb2xldDogIzUyNjBmZixcbiAgZ3JheTogIzkyOTQ5YyxcbiAgYWxlcnQ6ICNlOWU1MWQsXG4pO1xuXG46cm9vdCB7XG4gIC0tcHJpbWFyeTogIzAwNWNhOTtcbiAgLS1wcmltYXJ5LXN0cm9uZzogIzEwNDdkZjtcbiAgLS1wcmltYXJ5LXdlYWs6ICMwMDRjOGM7XG5cbiAgLS1zZWNvbmRhcnk6ICMzZGMyZmY7XG4gIC0tc2Vjb25kYXJ5LXN0cm9uZzogIzM2YWJlMDtcbiAgLS1zZWNvbmRhcnktd2VhazogIzUwYzhmZjtcblxuICAtLWxpZ2h0OiAjZmZmZmZmO1xuICAtLWxpZ2h0LXN0cm9uZzogI2ZmZmZmZjtcbiAgLS1saWdodC13ZWFrOiAjZjNmNWY5O1xuXG4gIC0tZGFuZ2VyOiAjZWI0NDVhO1xuICAtLWRhbmdlci1zdHJvbmc6ICNjZjNjNGY7XG4gIC0tZGFuZ2VyLXdlYWs6ICNlZDU3NmI7XG5cbiAgLS1ncmF5OiAjOTI5NDljO1xuICAtLWdyYXktc3Ryb25nOiAjODA4Mjg5O1xuICAtLWdyYXktd2VhazogIzlkOWZhNjtcblxuICAvKiogdGVydGlhcnkgKiovXG4gIC0tdmlvbGV0OiAjNTI2MGZmO1xuICAtLXZpb2xldC1zdHJvbmc6ICM0ODU0ZTA7XG4gIC0tdmlvbGV0LXdlYWs6ICM2MzcwZmY7XG5cbiAgLyoqIHN1Y2Nlc3MgKiovXG4gIC0tc3VjY2VzczogIzJkZDM2ZjtcbiAgLS1zdWNjZXNzLXNoYWRlOiAjMjhiYTYyO1xuICAtLXN1Y2Nlc3MtdGludDogIzQyZDc3ZDtcblxuICAvKiogd2FybmluZyAqKi9cbiAgLS13YXJuaW5nOiAjZmZjNDA5O1xuICAtLXdhcm5pbmctc2hhZGU6ICNlMGFjMDg7XG4gIC0td2FybmluZy10aW50OiAjZmZjYTIyO1xuXG4gIC0tYWxlcnQ6ICNlOWU1MWQ7XG4gIC0tYWxlcnQtc2hhZGU6ICNjYWM3MGY7XG4gIC0tYWxlcnQtdGludDogI2Y1ZjI1ODtcblxuICAtLXRleHQ6ICMxZjMwMzM7XG4gIC0tZGFyazogIzFmMzAzMztcblxuICAvLyBHUkFESUVOVEVTIC8qIFczQywgSUUxMCssIEZGMTYrLCBDaHJvbWUyNissIE9wZXJhMTIrLCBTYWZhcmk3KyAqL1xuXG4gIC0tZ3JhZGllbnQtbWFpbjogbGluZWFyLWdyYWRpZW50KHRvIHRvcCwgIzAwNWJlYSwgIzAwYzZmYiAxMDAlKTtcbiAgLS1ncmFkaWVudC1wcmltYXJ5OiBsaW5lYXItZ3JhZGllbnQodG8gcmlnaHQsICM0ZmFjZmUsICMwMGYyZmUpO1xuICAtLWdyYWRpZW50LWhlYWRlcjogbGluZWFyLWdyYWRpZW50KDI1MS4xM2RlZywgIzAwYTJjZCAyNC4zMiUsICMwMDY2YTYgNzkuNTglKTtcblxuICAtLWlvbi1jb2xvci1hbGVydDogdmFyKC0tYWxlcnQpO1xuICAtLWlvbi1jb2xvci1hbGVydC1yZ2I6IDU2LCAxMjgsIDI1NTtcbiAgLS1pb24tY29sb3ItYWxlcnQtY29udHJhc3Q6IHZhcigtLWxpZ2h0KTtcbiAgLS1pb24tY29sb3ItYWxlcnQtY29udHJhc3QtcmdiOiAyNTUsIDI1NSwgMjU1O1xuICAtLWlvbi1jb2xvci1hbGVydC1zaGFkZTogdmFyKC0tYWxlcnQtc3Ryb25nKTtcbiAgLS1pb24tY29sb3ItYWxlcnQtdGludDogdmFyKC0tYWxlcnQtd2Vhayk7XG5cbiAgLyoqIHByaW1hcnkgKiovXG4gIC0taW9uLWNvbG9yLXByaW1hcnk6IHZhcigtLXByaW1hcnkpO1xuICAtLWlvbi1jb2xvci1wcmltYXJ5LXJnYjogNTYsIDEyOCwgMjU1O1xuICAtLWlvbi1jb2xvci1wcmltYXJ5LWNvbnRyYXN0OiB2YXIoLS1saWdodCk7XG4gIC0taW9uLWNvbG9yLXByaW1hcnktY29udHJhc3QtcmdiOiAyNTUsIDI1NSwgMjU1O1xuICAtLWlvbi1jb2xvci1wcmltYXJ5LXNoYWRlOiB2YXIoLS1wcmltYXJ5LXN0cm9uZyk7XG4gIC0taW9uLWNvbG9yLXByaW1hcnktdGludDogdmFyKC0tcHJpbWFyeS13ZWFrKTtcblxuICAvKiogc2Vjb25kYXJ5ICoqL1xuICAtLWlvbi1jb2xvci1zZWNvbmRhcnk6IHZhcigtLXNlY29uZGFyeSk7XG4gIC0taW9uLWNvbG9yLXNlY29uZGFyeS1yZ2I6IDYxLCAxOTQsIDI1NTtcbiAgLS1pb24tY29sb3Itc2Vjb25kYXJ5LWNvbnRyYXN0OiB2YXIoLS1saWdodCk7XG4gIC0taW9uLWNvbG9yLXNlY29uZGFyeS1jb250cmFzdC1yZ2I6IDI1NSwgMjU1LCAyNTU7XG4gIC0taW9uLWNvbG9yLXNlY29uZGFyeS1zaGFkZTogdmFyKC0tc2Vjb25kYXJ5LXN0cm9uZyk7XG4gIC0taW9uLWNvbG9yLXNlY29uZGFyeS10aW50OiB2YXIoLS1zZWNvbmRhcnktd2Vhayk7XG5cbiAgLyoqIHRlcnRpYXJ5ICoqL1xuICAtLWlvbi1jb2xvci10ZXJ0aWFyeTogdmFyKC0tdmlvbGV0KTtcbiAgLS1pb24tY29sb3ItdGVydGlhcnktcmdiOiA4MiwgOTYsIDI1NTtcbiAgLS1pb24tY29sb3ItdGVydGlhcnktY29udHJhc3Q6IHZhcigtLWxpZ2h0KTtcbiAgLS1pb24tY29sb3ItdGVydGlhcnktY29udHJhc3QtcmdiOiAyNTUsIDI1NSwgMjU1O1xuICAtLWlvbi1jb2xvci10ZXJ0aWFyeS1zaGFkZTogdmFyKC0tdmlvbGV0LXN0cm9uZyk7XG4gIC0taW9uLWNvbG9yLXRlcnRpYXJ5LXRpbnQ6IHZhcigtLXZpb2xldC13ZWFrKTtcblxuICAvKiogc3VjY2VzcyAqKi9cbiAgLS1pb24tY29sb3Itc3VjY2VzczogdmFyKC0tc3VjY2Vzcyk7XG4gIC0taW9uLWNvbG9yLXN1Y2Nlc3MtcmdiOiA0NSwgMjExLCAxMTE7XG4gIC0taW9uLWNvbG9yLXN1Y2Nlc3MtY29udHJhc3Q6IHZhcigtLWxpZ2h0KTtcbiAgLS1pb24tY29sb3Itc3VjY2Vzcy1jb250cmFzdC1yZ2I6IDI1NSwgMjU1LCAyNTU7XG4gIC0taW9uLWNvbG9yLXN1Y2Nlc3Mtc2hhZGU6IHZhcigtLXN1Y2Nlc3Mtc3Ryb25nKTtcbiAgLS1pb24tY29sb3Itc3VjY2Vzcy10aW50OiB2YXIoLS1zdWNjZXNzLXdlYWspO1xuXG4gIC8qKiB3YXJuaW5nICoqL1xuICAtLWlvbi1jb2xvci13YXJuaW5nOiB2YXIoLS13YXJuaW5nKTtcbiAgLS1pb24tY29sb3Itd2FybmluZy1yZ2I6IDI1NSwgMTk2LCA5O1xuICAtLWlvbi1jb2xvci13YXJuaW5nLWNvbnRyYXN0OiB2YXIoLS1kYXJrKTtcbiAgLS1pb24tY29sb3Itd2FybmluZy1jb250cmFzdC1yZ2I6IDAsIDAsIDA7XG4gIC0taW9uLWNvbG9yLXdhcm5pbmctc2hhZGU6IHZhcigtLXdhcm5pbmctc3Ryb25nKTtcbiAgLS1pb24tY29sb3Itd2FybmluZy10aW50OiB2YXIoLS13YXJuaW5nLXdlYWspO1xuXG4gIC8qKiBkYW5nZXIgKiovXG4gIC0taW9uLWNvbG9yLWRhbmdlcjogdmFyKC0tcmVkKTtcbiAgLS1pb24tY29sb3ItZGFuZ2VyLXJnYjogMjM1LCA2OCwgOTA7XG4gIC0taW9uLWNvbG9yLWRhbmdlci1jb250cmFzdDogdmFyKC0tbGlnaHQpO1xuICAtLWlvbi1jb2xvci1kYW5nZXItY29udHJhc3QtcmdiOiAyNTUsIDI1NSwgMjU1O1xuICAtLWlvbi1jb2xvci1kYW5nZXItc2hhZGU6IHZhcigtLXJlZC1zdHJvbmcpO1xuICAtLWlvbi1jb2xvci1kYW5nZXItdGludDogdmFyKC0tcmVkLXdlYWspO1xuXG4gIC8qKiBkYXJrICoqL1xuICAtLWlvbi1jb2xvci1kYXJrOiB2YXIoLS1kYXJrKTtcbiAgLS1pb24tY29sb3ItZGFyay1yZ2I6IDM0LCAzNiwgNDA7XG4gIC0taW9uLWNvbG9yLWRhcmstY29udHJhc3Q6IHZhcigtLWxpZ2h0KTtcbiAgLS1pb24tY29sb3ItZGFyay1jb250cmFzdC1yZ2I6IDI1NSwgMjU1LCAyNTU7XG4gIC0taW9uLWNvbG9yLWRhcmstc2hhZGU6IHZhcigtLWRhcmspO1xuICAtLWlvbi1jb2xvci1kYXJrLXRpbnQ6IHZhcigtLWRhcmspO1xuXG4gIC8qKiBtZWRpdW0gKiovXG4gIC0taW9uLWNvbG9yLW1lZGl1bTogdmFyKC0tZ3JheSk7XG4gIC0taW9uLWNvbG9yLW1lZGl1bS1yZ2I6IDE0NiwgMTQ4LCAxNTY7XG4gIC0taW9uLWNvbG9yLW1lZGl1bS1jb250cmFzdDogdmFyKC0tbGlnaHQpO1xuICAtLWlvbi1jb2xvci1tZWRpdW0tY29udHJhc3QtcmdiOiAyNTUsIDI1NSwgMjU1O1xuICAtLWlvbi1jb2xvci1tZWRpdW0tc2hhZGU6IHZhcigtLWdyYXktc3Ryb25nKTtcbiAgLS1pb24tY29sb3ItbWVkaXVtLXRpbnQ6IHZhcigtLWdyYXktd2Vhayk7XG5cbiAgLyoqIGxpZ2h0ICoqL1xuICAtLWlvbi1jb2xvci1saWdodDogdmFyKC0tbGlnaHQpO1xuICAtLWlvbi1jb2xvci1saWdodC1yZ2I6IDI0NCwgMjQ1LCAyNDg7XG4gIC0taW9uLWNvbG9yLWxpZ2h0LWNvbnRyYXN0OiB2YXIoLS1kYXJrKTtcbiAgLS1pb24tY29sb3ItbGlnaHQtY29udHJhc3QtcmdiOiAwLCAwLCAwO1xuICAtLWlvbi1jb2xvci1saWdodC1zaGFkZTogdmFyKC0tbGlnaHQtc3Ryb25nKTtcbiAgLS1pb24tY29sb3ItbGlnaHQtdGludDogdmFyKC0tbGlnaHQtd2Vhayk7XG59XG4iLCJAaW1wb3J0IFwiLi4vdGhlbWUvdmFyaWFibGVzLnNjc3NcIjtcblxuaW9uLW1lbnUge1xuICAvLyAtLWJhY2tncm91bmQ6IHZhcigtLWlvbi1pdGVtLWJhY2tncm91bmQsIHZhcigtLWlvbi1iYWNrZ3JvdW5kLWNvbG9yLCAjZmZmKSk7XG4gIGlvbi1saXN0IHtcbiAgICBiYWNrZ3JvdW5kOiB2YXIoLS1wcmltYXJ5KTtcbiAgfVxufVxuXG5pb24tbGFiZWwge1xuICBjb2xvcjogdmFyKC0tbGlnaHQpO1xufVxuXG5pb24tbWVudS5tZCBpb24tY29udGVudCB7XG4gIC0tcGFkZGluZy1zdGFydDogOHB4O1xuICAtLXBhZGRpbmctZW5kOiA4cHg7XG4gIC0tcGFkZGluZy10b3A6IDIwcHg7XG4gIC0tcGFkZGluZy1ib3R0b206IDIwcHg7XG59XG5cbmlvbi1tZW51Lm1kIGlvbi1saXN0IHtcbiAgcGFkZGluZzogMjBweCAwO1xufVxuXG5pb24tbWVudS5tZCBpb24tbm90ZSB7XG4gIG1hcmdpbi1ib3R0b206IDMwcHg7XG59XG5cbmlvbi1tZW51Lm1kIGlvbi1saXN0LWhlYWRlcixcbmlvbi1tZW51Lm1kIGlvbi1ub3RlIHtcbiAgcGFkZGluZy1sZWZ0OiAxMHB4O1xufVxuXG5pb24tbWVudS5tZCBpb24tbGlzdCNpbmJveC1saXN0IHtcbiAgYm9yZGVyLWJvdHRvbTogMXB4IHNvbGlkIHZhcigtLWlvbi1jb2xvci1zdGVwLTE1MCwgI2Q3ZDhkYSk7XG59XG5cbmlvbi1tZW51Lm1kIGlvbi1saXN0I2luYm94LWxpc3QgaW9uLWxpc3QtaGVhZGVyIHtcbiAgZm9udC1zaXplOiAyMnB4O1xuICBmb250LXdlaWdodDogNjAwO1xuXG4gIG1pbi1oZWlnaHQ6IDIwcHg7XG59XG5cbmlvbi1tZW51Lm1kIGlvbi1saXN0I2xhYmVscy1saXN0IGlvbi1saXN0LWhlYWRlciB7XG4gIGZvbnQtc2l6ZTogMTZweDtcblxuICBtYXJnaW4tYm90dG9tOiAxOHB4O1xuXG4gIGNvbG9yOiAjNzU3NTc1O1xuXG4gIG1pbi1oZWlnaHQ6IDI2cHg7XG59XG5cbmlvbi1tZW51Lm1kIGlvbi1pdGVtIHtcbiAgLS1wYWRkaW5nLXN0YXJ0OiAxMHB4O1xuICAtLXBhZGRpbmctZW5kOiAxMHB4O1xuICBib3JkZXItcmFkaXVzOiA0cHg7XG59XG5cbmlvbi1tZW51Lm1kIGlvbi1pdGVtLnNlbGVjdGVkIHtcbiAgLS1iYWNrZ3JvdW5kOiByZ2JhKHZhcigtLWlvbi1jb2xvci1wcmltYXJ5LXJnYiksIDAuMTQpO1xufVxuXG5pb24tbWVudS5tZCBpb24taXRlbS5zZWxlY3RlZCBpb24taWNvbiB7XG4gIGNvbG9yOiB2YXIoLS1pb24tY29sb3ItcHJpbWFyeSk7XG59XG5cbmlvbi1tZW51Lm1kIGlvbi1pdGVtIGlvbi1pY29uIHtcbiAgY29sb3I6ICM2MTZlN2U7XG59XG5cbmlvbi1tZW51Lm1kIGlvbi1pdGVtIGlvbi1sYWJlbCB7XG4gIGZvbnQtd2VpZ2h0OiA1MDA7XG59XG5cbmlvbi1tZW51LmlvcyBpb24tY29udGVudCB7XG4gIC0tcGFkZGluZy1ib3R0b206IDIwcHg7XG59XG5cbmlvbi1tZW51LmlvcyBpb24tbGlzdCB7XG4gIHBhZGRpbmc6IDIwcHggMCAwIDA7XG59XG5cbmlvbi1tZW51LmlvcyBpb24tbm90ZSB7XG4gIGxpbmUtaGVpZ2h0OiAyNHB4O1xuICBtYXJnaW4tYm90dG9tOiAyMHB4O1xufVxuXG5pb24tbWVudS5pb3MgaW9uLWl0ZW0ge1xuICAtLXBhZGRpbmctc3RhcnQ6IDE2cHg7XG4gIC0tcGFkZGluZy1lbmQ6IDE2cHg7XG4gIC0tbWluLWhlaWdodDogNTBweDtcbn1cblxuaW9uLW1lbnUuaW9zIGlvbi1pdGVtLnNlbGVjdGVkIGlvbi1pY29uIHtcbiAgY29sb3I6IHZhcigtLWlvbi1jb2xvci1wcmltYXJ5KTtcbn1cblxuaW9uLW1lbnUuaW9zIGlvbi1pdGVtIGlvbi1pY29uIHtcbiAgZm9udC1zaXplOiAyNHB4O1xuICBjb2xvcjogIzczODQ5YTtcbn1cblxuaW9uLW1lbnUuaW9zIGlvbi1saXN0I2xhYmVscy1saXN0IGlvbi1saXN0LWhlYWRlciB7XG4gIG1hcmdpbi1ib3R0b206IDhweDtcbn1cblxuaW9uLW1lbnUuaW9zIGlvbi1saXN0LWhlYWRlcixcbmlvbi1tZW51LmlvcyBpb24tbm90ZSB7XG4gIHBhZGRpbmctbGVmdDogMTZweDtcbiAgcGFkZGluZy1yaWdodDogMTZweDtcbn1cblxuaW9uLW1lbnUuaW9zIGlvbi1ub3RlIHtcbiAgbWFyZ2luLWJvdHRvbTogOHB4O1xufVxuXG5pb24tbm90ZSB7XG4gIGRpc3BsYXk6IGlubGluZS1ibG9jaztcbiAgZm9udC1zaXplOiAxNnB4O1xuXG4gIGNvbG9yOiB2YXIoLS1pb24tY29sb3ItbWVkaXVtLXNoYWRlKTtcbn1cblxuaW9uLWl0ZW0uc2VsZWN0ZWQge1xuICAtLWNvbG9yOiB2YXIoLS1pb24tY29sb3ItcHJpbWFyeSk7XG59XG4iXX0= */");

/***/ }),

/***/ "zUnb":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "fXoL");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "a3Wg");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "ZAI4");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "AytR");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(err => console.log(err));


/***/ }),

/***/ "zn8P":
/*!******************************************************!*\
  !*** ./$$_lazy_route_resource lazy namespace object ***!
  \******************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "zn8P";

/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map