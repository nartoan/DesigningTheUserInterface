$(document).ready(function(){

    
    $("[data-toggle=tooltip]").tooltip();
});



<script src='https://cdn.firebase.com/js/client/2.2.1/firebase.js'></script>
        <script src="https://www.gstatic.com/firebasejs/3.4.1/firebase.js"></script>
        <script>
        // Initialize Firebase
        var config = {
        apiKey: "AIzaSyCVgS47frE4mg5nZwQ7ovBk2Zji5srjf9s",
        authDomain: "dtui-nhom8.firebaseapp.com",
        databaseURL: "https://dtui-nhom8.firebaseio.com",
        storageBucket: "",
        messagingSenderId: "394242325405"
        };
        firebase.initializeApp(config);
</script>
<script type="text/javascript">
            //var firebase =
            var ref = new Firebase("https://dtui-nhom8.firebaseio.com");
        // Thanks to https://gist.github.com/hurjas/2660489#file-timestamp-js-L26
        function timeStamp() {
        var now = new Date();
        var date = [now.getMonth() + 1, now.getDate(), now.getFullYear()];
        var time = [now.getHours(), now.getMinutes()];
        var suffix = (time[0] < 12) ? "AM" : "PM";
        time[0] = (time[0] < 12) ? time[0] : time[0] - 12;
        for (var i = 1; i < 3; i++) {
        if (time[i] < 10) {
        time[i] = "0" + time[i];
        }
        }
        return date.join("/") + ", " + time.join(":") + " " + suffix;
        }
        function postComment() {
        var name = document.getElementById("name").value,
        comment = document.getElementById("comment").value,
        time = timeStamp();
        if (name && comment) {
        ref.push({
        name: name,
        comment: comment,
        time: time
        });
        }
        document.getElementById("name").value = '';
        document.getElementById("comment").value = '';
        }
        ref.on("child_added", function(snapshot) {
        var comment = snapshot.val();
        addComment(comment.name, comment.comment, comment.time);
        });
        function addComment(name, comment, timeStamp) {
        var comments = document.getElementById("comments");
        comments.innerHTML = "<hr><h4>" + name + "<span style='float: right;'>" + timeStamp + "</span></h4><p>" + comment + "</p>" + comments.innerHTML;
        }
        </script>




