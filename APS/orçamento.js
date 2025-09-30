document.addEventListener('DOMContentLoaded', function() {
    if(!sessionStorage.getItem('isLoggedIn'))
        this.location.href="index.html"; 
});