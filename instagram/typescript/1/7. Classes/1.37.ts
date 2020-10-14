module Listing1_37 {

    class Song {
        constructor(private artist: string, private title: string) {

        }

        play() {
            console.log('Playing ' + this.title + ' by ' + this.artist);
        }
    }

    class Jukebox {
        constructor(private songs: Song[]) {
        }

        play() {
            var song = this.getRandomSong(); //calling line no 22, here it is returning Song class object
            song.play();
        }

        private getRandomSong() {
            var songCount = this.songs.length;      
			var songIndex = Math.floor( (Math.random()) * songCount);
		return this.songs[songIndex];
            
        }
    }
	
	
	
	
    var songs = [ //creating array of Song class
        new Song('Bushbaby', 'Megaphone'),  //creating object of Song class and passing data to constructor
        new Song('Delays', 'One More Lie In'),
        new Song('Goober Gun', 'Stereo'),
        new Song('Sohnee', 'Shatter'),
        new Song('Get Amped', 'Celebrity')
    ];

    var jukebox = new Jukebox(songs);   //passing above array called songs inside constructor of Jukebox i.e. line no 14

    jukebox.play(); //calling line no 17

} 