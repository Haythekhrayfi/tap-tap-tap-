package com.developer.filepicker.model;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class DialogProperties {
    public int selection_mode = 0;
    public int selection_type = 0;
    public File root = new File(DialogConfigs.DEFAULT_DIR);
    public File error_dir = new File(DialogConfigs.DEFAULT_DIR);
    public File offset = new File(DialogConfigs.DEFAULT_DIR);
    public String[] extensions = null;
    public boolean show_hidden_files = false;
}
