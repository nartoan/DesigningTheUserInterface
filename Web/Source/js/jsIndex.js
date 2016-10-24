window.onclick = function(e) {
    if (!e.target.matches('.notification') && !e.target.matches(".fa-bell-o") && !e.target.matches(".name-noti")) {
        var dropdowns = document.getElementsByClassName("content-noti");
        for (var d = 0; d < dropdowns.length; d++) {
            var openDropdown = dropdowns[d];
            if (openDropdown.classList.contains('show')) {
                openDropdown.classList.remove('show');
            }
        }
    }

    if (!e.target.matches('.information') && !e.target.matches(".display-img") && !e.target.matches(".name-user")) {
        var dropdowns = document.getElementsByClassName("content-infor");
        for (var d = 0; d < dropdowns.length; d++) {
            var openDropdown = dropdowns[d];
            if (openDropdown.classList.contains('show')) {
                openDropdown.classList.remove('show');
            }
        }
    }

    if (!e.target.matches('.search-box') && !e.target.matches(".fa-search") && !e.target.matches(".cheat-search")) {
        var dropdowns = document.getElementsByClassName("list-event");
        for (var d = 0; d < dropdowns.length; d++) {
            var openDropdown = dropdowns[d];
            if (openDropdown.classList.contains('show')) {
                openDropdown.classList.remove('show');
            }
        }
    }
}

function showInformation() {
    document.getElementById("dropdown-infor").classList.toggle("show");
}

function showNotification() {
    document.getElementById("dropdown-noti").classList.toggle("show");
}

function showAllEvent() {
    document.getElementById("all-event").classList.toggle("show");
}
