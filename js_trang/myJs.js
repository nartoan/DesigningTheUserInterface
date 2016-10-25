$(document).ready(function(){

    
    $("[data-toggle=tooltip]").tooltip();
});

//Ratting

// Starrr plugin (https://github.com/dobtco/starrr)
var __slice = [].slice;

(function($, window) {
  var Starrr;

  Starrr = (function() {
    Starrr.prototype.defaults = {
      rating: void 0,
      numStars: 5,
      change: function(e, value) {}
    };

    function Starrr($el, options) {
      var i, _, _ref,
        _this = this;

      this.options = $.extend({}, this.defaults, options);
      this.$el = $el;
      _ref = this.defaults;
      for (i in _ref) {
        _ = _ref[i];
        if (this.$el.data(i) != null) {
          this.options[i] = this.$el.data(i);
        }
      }
      this.createStars();
      this.syncRating();
      this.$el.on('mouseover.starrr', 'span', function(e) {
        return _this.syncRating(_this.$el.find('span').index(e.currentTarget) + 1);
      });
      this.$el.on('mouseout.starrr', function() {
        return _this.syncRating();
      });
      this.$el.on('click.starrr', 'span', function(e) {
        return _this.setRating(_this.$el.find('span').index(e.currentTarget) + 1);
      });
      this.$el.on('starrr:change', this.options.change);
    }

    Starrr.prototype.createStars = function() {
      var _i, _ref, _results;

      _results = [];
      for (_i = 1, _ref = this.options.numStars; 1 <= _ref ? _i <= _ref : _i >= _ref; 1 <= _ref ? _i++ : _i--) {
        _results.push(this.$el.append("<span class='glyphicon .glyphicon-star-empty'></span>"));
      }
      return _results;
    };

    Starrr.prototype.setRating = function(rating) {
      if (this.options.rating === rating) {
        rating = void 0;
      }
      this.options.rating = rating;
      this.syncRating();
      return this.$el.trigger('starrr:change', rating);
    };

    Starrr.prototype.syncRating = function(rating) {
      var i, _i, _j, _ref;

      rating || (rating = this.options.rating);
      if (rating) {
        for (i = _i = 0, _ref = rating - 1; 0 <= _ref ? _i <= _ref : _i >= _ref; i = 0 <= _ref ? ++_i : --_i) {
          this.$el.find('span').eq(i).removeClass('glyphicon-star-empty').addClass('glyphicon-star');
        }
      }
      if (rating && rating < 5) {
        for (i = _j = rating; rating <= 4 ? _j <= 4 : _j >= 4; i = rating <= 4 ? ++_j : --_j) {
          this.$el.find('span').eq(i).removeClass('glyphicon-star').addClass('glyphicon-star-empty');
        }
      }
      if (!rating) {
        return this.$el.find('span').removeClass('glyphicon-star').addClass('glyphicon-star-empty');
      }
    };

    return Starrr;

  })();
  return $.fn.extend({
    starrr: function() {
      var args, option;

      option = arguments[0], args = 2 <= arguments.length ? __slice.call(arguments, 1) : [];
      return this.each(function() {
        var data;

        data = $(this).data('star-rating');
        if (!data) {
          $(this).data('star-rating', (data = new Starrr($(this), option)));
        }
        if (typeof option === 'string') {
          return data[option].apply(data, args);
        }
      });
    }
  });
})(window.jQuery, window);

$(function() {
  return $(".starrr").starrr();
});

$( document ).ready(function() {
      
  $('#stars').on('starrr:change', function(e, value){
    $('#count').html(value);
  });
  
  $('#stars-existing').on('starrr:change', function(e, value){
    $('#count-existing').html(value);
  });
});
// End ratting


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




