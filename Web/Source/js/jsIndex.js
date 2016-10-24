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

// Create a clone of the menu, right next to original.
$('.menu').addClass('original').clone().insertAfter('.menu').addClass('cloned').css('position', 'fixed').css('top', '0').css('margin-top', '0').css('z-index', '500').removeClass('original').hide();

scrollIntervalID = setInterval(stickIt, 10);


function stickIt() {

    var orgElementPos = $('.original').offset();
    orgElementTop = orgElementPos.top;

    if ($(window).scrollTop() >= (orgElementTop)) {
        // scrolled past the original position; now only show the cloned, sticky element.

        // Cloned element should always have same left position and width as original element.     
        orgElement = $('.original');
        coordsOrgElement = orgElement.offset();
        leftOrgElement = coordsOrgElement.left;
        widthOrgElement = orgElement.css('width');
        $('.cloned').css('left', leftOrgElement + 'px').css('top', 0).css('width', widthOrgElement).show();
        $('.original').css('visibility', 'hidden');
    } else {
        // not scrolled past the menu; only show the original menu.
        $('.cloned').hide();
        $('.original').css('visibility', 'visible');
    }
}
