package com.developer.filepicker.model;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class FileListItem implements Comparable<FileListItem> {
    private boolean directory;
    private String filename;
    private String location;
    private boolean marked;
    private long time;

    @Override // java.lang.Comparable
    public int compareTo(FileListItem fileListItem) {
        if (!(fileListItem.isDirectory() && isDirectory()) && (fileListItem.isDirectory() || isDirectory())) {
            return (!fileListItem.isDirectory() || isDirectory()) ? -1 : 1;
        }
        return this.filename.toLowerCase().compareTo(fileListItem.getFilename().toLowerCase(Locale.getDefault()));
    }

    public String getFilename() {
        return this.filename;
    }

    public String getLocation() {
        return this.location;
    }

    public long getTime() {
        return this.time;
    }

    public boolean isDirectory() {
        return this.directory;
    }

    public boolean isMarked() {
        return this.marked;
    }

    public void setDirectory(boolean z10) {
        this.directory = z10;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setMarked(boolean z10) {
        this.marked = z10;
    }

    public void setTime(long j10) {
        this.time = j10;
    }
}
