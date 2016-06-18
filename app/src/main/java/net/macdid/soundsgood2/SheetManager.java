package net.macdid.soundsgood2;

/**
 * Created by user on 2016/6/17.
 */
public class SheetManager {

    /**
     * update old sheet music stored in the sheetManager with the new sheet music
     *
     */
    public boolean update(int id,MusicSheet ms){

        return fM.update(id,ms);
    }
    /**
     * add new sheet music to sheetManager
     *
     * @return the id of this new sheet music
     */
    public int add(){
        int Id = fM.createNewSheetMusic();
		return Id;
    }
    /**
     * delete sheet music from sheetManager
     *
     * @return ture if delete successfully
     */
    public boolean delete(int id) {

        return fM.Delete(id);
    }

    /**
     * anser the request of others and return a SheetMusic
     *
     * @param id the id of the sheet music
     * @return a SheetMusic
     */
    public MusicSheet get(int id){
        MusicSheet MS = fM.getSheetMusic(id);
		return MS;
    }
    /**
     * return a sheetEditor
     *
     */
    public SheetEditor getSheetEditor(int id,MusicSheet ms){
		SheetEditor SE = new SheetEditor(id,ms);
		return SE;
    }
}
