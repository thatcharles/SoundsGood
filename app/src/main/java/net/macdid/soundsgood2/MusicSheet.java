package net.macdid.soundsgood2;

/**
 * Created by user on 2016/6/17.
 */


public class MusicSheet {

    private MusicTrack MT1 = new MusicTrack(),MT2 = new MusicTrack();
    private int Id;

    public MusicSheet(int id){
        Id = id;
    }
    public void edit(int TrackId,int PositionX,int PositionY){
        if(TrackId == 0){
            MT1.edit(PositionX,PositionY);
        }else if(TrackId == 1) {
            MT2.edit(PositionX, PositionY);
        }
    }

    private class MusicTrack {

        private int[][] Track = new int[8][8];

        public MusicTrack(){
            for(int i=0;i<8;i++)
                for(int j=0;j<8;j++)
                    Track[i][j] = 0;
        }

        public void edit(int X,int Y){
            Track[X][Y] = ~Track[X][Y];
        }


    }
}


