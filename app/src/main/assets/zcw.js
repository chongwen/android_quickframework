function showAndroidToast(toast) {
    hrbbApp.showToast(toast);
}

function setTitle(title) {
    hrbbApp.setTitle(title);
}

function getNativeU(title) {
    hrbbApp.getUser(title);
}

function printU(title) {
    alert(title);
}

function jstoast(title) {
    alert(title);
}

function getUserAgent() {
    let u = navigator.userAgent;
    console.log(u);
    alert(u);
}