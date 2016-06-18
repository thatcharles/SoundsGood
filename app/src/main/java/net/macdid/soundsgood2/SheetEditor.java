package net.macdid.soundsgood2;

/**
 * Created by user on 2016/6/17.
 */
public class SheetEditor {
    private MusicSheet MS;

    public SheetEditor(int id,MusicSheet ms){
        MS = ms;
    }

    public void edit(int TrackId,int PositionX,int PositionY){
        MS.edit(TrackId,PositionX,PositionY);
    }

    public int swipeTrack(int TrackId){
        TrackId +=1;
        TrackId %=2;
        return TrackId;
    }

}
