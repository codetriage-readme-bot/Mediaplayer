package com.mediaplayer.utility;

import com.mediaplayer.com.SongInfo;

import java.util.LinkedList;

public class SongsHolder {

	public  LinkedList<SongInfo > songQueue;
	public  SongInfo currentSongInfo;

	public SongInfo getCurrentSongInfo() {
		return currentSongInfo;
	}

	public void setCurrentSongInfo(SongInfo currentSongInfo) {
		this.currentSongInfo = currentSongInfo;
	}

	public LinkedList<SongInfo> getSongQueue() {
		if(songQueue==null) songQueue = new LinkedList<>();
		return songQueue;
	}

	public  void addSongToQueue(SongInfo songInfo){
		if(songQueue == null){
			songQueue = new LinkedList<>();
			currentSongInfo = songInfo;
		}
		songQueue.addLast(songInfo);
	}

}
