var Listing1_37;
(function (Listing1_37) {
    var Song = (function () {
        function Song(artist, title) {
            this.artist = artist;
            this.title = title;
        }
        Song.prototype.play = function () {
            console.log('Playing ' + this.title + ' by ' + this.artist);
        };
        return Song;
    })();
    var Jukebox = (function () {
        function Jukebox(songs) {
            this.songs = songs;
        }
        Jukebox.prototype.play = function () {
            var song = this.getRandomSong(); //calling line no 22, here it is returning Song class object
            song.play();
        };
        Jukebox.prototype.getRandomSong = function () {
            var songCount = this.songs.length;
            var songIndex = Math.floor((Math.random()) * songCount);
            return this.songs[songIndex];
        };
        return Jukebox;
    })();
    var songs = [
        new Song('Bushbaby', 'Megaphone'),
        new Song('Delays', 'One More Lie In'),
        new Song('Goober Gun', 'Stereo'),
        new Song('Sohnee', 'Shatter'),
        new Song('Get Amped', 'Celebrity')
    ];
    var jukebox = new Jukebox(songs); //passing above array called songs inside constructor of Jukebox i.e. line no 14
    jukebox.play(); //calling line no 17
})(Listing1_37 || (Listing1_37 = {}));
