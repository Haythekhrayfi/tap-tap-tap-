package com.developer.filepicker.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.developer.filepicker.R;
import com.developer.filepicker.controller.DialogSelectionListener;
import com.developer.filepicker.controller.NotifyItemChecked;
import com.developer.filepicker.controller.adapters.FileListAdapter;
import com.developer.filepicker.model.DialogProperties;
import com.developer.filepicker.model.FileListItem;
import com.developer.filepicker.model.MarkedItemList;
import com.developer.filepicker.utils.ExtensionFilter;
import com.developer.filepicker.utils.Utility;
import com.developer.filepicker.widget.MaterialCheckbox;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FilePickerDialog extends Dialog implements AdapterView.OnItemClickListener {
    public static final int EXTERNAL_READ_PERMISSION_GRANT = 112;
    private DialogSelectionListener callbacks;
    private final Context context;
    private TextView dir_path;
    private TextView dname;
    private ExtensionFilter filter;
    private ArrayList<FileListItem> internalList;
    private ListView listView;
    private FileListAdapter mFileListAdapter;
    private String negativeBtnNameStr;
    private String positiveBtnNameStr;
    private DialogProperties properties;
    private Button select;
    private TextView title;
    private String titleStr;

    public FilePickerDialog(Context context) {
        super(context);
        this.titleStr = null;
        this.positiveBtnNameStr = null;
        this.negativeBtnNameStr = null;
        this.context = context;
        DialogProperties dialogProperties = new DialogProperties();
        this.properties = dialogProperties;
        this.filter = new ExtensionFilter(dialogProperties);
        this.internalList = new ArrayList<>();
    }

    public FilePickerDialog(Context context, DialogProperties dialogProperties) {
        super(context);
        this.titleStr = null;
        this.positiveBtnNameStr = null;
        this.negativeBtnNameStr = null;
        this.context = context;
        this.properties = dialogProperties;
        this.filter = new ExtensionFilter(dialogProperties);
        this.internalList = new ArrayList<>();
    }

    public FilePickerDialog(Context context, DialogProperties dialogProperties, int i10) {
        super(context, i10);
        this.titleStr = null;
        this.positiveBtnNameStr = null;
        this.negativeBtnNameStr = null;
        this.context = context;
        this.properties = dialogProperties;
        this.filter = new ExtensionFilter(dialogProperties);
        this.internalList = new ArrayList<>();
    }

    private void setTitle() {
        TextView textView = this.title;
        if (textView == null || this.dname == null) {
            return;
        }
        String str = this.titleStr;
        int visibility = textView.getVisibility();
        if (str == null) {
            if (visibility == 0) {
                this.title.setVisibility(4);
            }
            if (this.dname.getVisibility() == 4) {
                this.dname.setVisibility(0);
                return;
            }
            return;
        }
        if (visibility == 4) {
            this.title.setVisibility(0);
        }
        this.title.setText(this.titleStr);
        if (this.dname.getVisibility() == 0) {
            this.dname.setVisibility(4);
        }
    }

    private boolean validateOffsetPath() {
        String absolutePath = this.properties.offset.getAbsolutePath();
        String absolutePath2 = this.properties.root.getAbsolutePath();
        return !absolutePath.equals(absolutePath2) && absolutePath.contains(absolutePath2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        MarkedItemList.clearSelectionList();
        this.internalList.clear();
        super.dismiss();
    }

    public DialogProperties getProperties() {
        return this.properties;
    }

    public void markFiles(List<String> list) {
        File file;
        FileListItem fileListItem;
        FileListItem fileListItem2;
        if (list == null || list.size() <= 0) {
            return;
        }
        if (this.properties.selection_mode == 0) {
            File file2 = new File(list.get(0));
            int i10 = this.properties.selection_type;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2 || !file2.exists()) {
                        return;
                    } else {
                        fileListItem2 = new FileListItem();
                    }
                } else if (!file2.exists() || !file2.isDirectory()) {
                    return;
                } else {
                    fileListItem2 = new FileListItem();
                }
            } else if (!file2.exists() || !file2.isFile()) {
                return;
            } else {
                fileListItem2 = new FileListItem();
            }
            fileListItem2.setFilename(file2.getName());
            fileListItem2.setDirectory(file2.isDirectory());
            fileListItem2.setMarked(true);
            fileListItem2.setTime(file2.lastModified());
            fileListItem2.setLocation(file2.getAbsolutePath());
            MarkedItemList.addSelectedItem(fileListItem2);
            return;
        }
        for (String str : list) {
            int i11 = this.properties.selection_type;
            if (i11 == 0) {
                file = new File(str);
                if (file.exists() && file.isFile()) {
                    fileListItem = new FileListItem();
                    fileListItem.setFilename(file.getName());
                    fileListItem.setDirectory(file.isDirectory());
                    fileListItem.setMarked(true);
                    fileListItem.setTime(file.lastModified());
                    fileListItem.setLocation(file.getAbsolutePath());
                    MarkedItemList.addSelectedItem(fileListItem);
                }
            } else if (i11 == 1) {
                file = new File(str);
                if (file.exists() && file.isDirectory()) {
                    fileListItem = new FileListItem();
                    fileListItem.setFilename(file.getName());
                    fileListItem.setDirectory(file.isDirectory());
                    fileListItem.setMarked(true);
                    fileListItem.setTime(file.lastModified());
                    fileListItem.setLocation(file.getAbsolutePath());
                    MarkedItemList.addSelectedItem(fileListItem);
                }
            } else if (i11 == 2) {
                file = new File(str);
                if (file.exists() && (file.isFile() || file.isDirectory())) {
                    fileListItem = new FileListItem();
                    fileListItem.setFilename(file.getName());
                    fileListItem.setDirectory(file.isDirectory());
                    fileListItem.setMarked(true);
                    fileListItem.setTime(file.lastModified());
                    fileListItem.setLocation(file.getAbsolutePath());
                    MarkedItemList.addSelectedItem(fileListItem);
                }
            }
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        String string = this.dname.getText().toString();
        if (this.internalList.size() <= 0) {
            super.onBackPressed();
            return;
        }
        File file = new File(this.internalList.get(0).getLocation());
        if (string.equals(this.properties.root.getName()) || !file.canRead()) {
            super.onBackPressed();
        } else {
            this.dname.setText(file.getName());
            this.dir_path.setText(file.getAbsolutePath());
            this.internalList.clear();
            if (!file.getName().equals(this.properties.root.getName())) {
                FileListItem fileListItem = new FileListItem();
                fileListItem.setFilename(this.context.getString(R.string.label_parent_dir));
                fileListItem.setDirectory(true);
                fileListItem.setLocation(file.getParentFile().getAbsolutePath());
                fileListItem.setTime(file.lastModified());
                this.internalList.add(fileListItem);
            }
            this.internalList = Utility.prepareFileListEntries(this.internalList, file, this.filter, this.properties.show_hidden_files);
            this.mFileListAdapter.notifyDataSetChanged();
        }
        setTitle();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.dialog_main);
        this.listView = (ListView) findViewById(R.id.fileList);
        this.select = (Button) findViewById(R.id.select);
        if (MarkedItemList.getFileCount() == 0) {
            this.select.setEnabled(false);
            int color = this.context.getResources().getColor(R.color.colorAccent, this.context.getTheme());
            this.select.setTextColor(Color.argb(128, Color.red(color), Color.green(color), Color.blue(color)));
        }
        this.dname = (TextView) findViewById(R.id.dname);
        this.title = (TextView) findViewById(R.id.title);
        this.dir_path = (TextView) findViewById(R.id.dir_path);
        Button button = (Button) findViewById(R.id.cancel);
        String str = this.negativeBtnNameStr;
        if (str != null) {
            button.setText(str);
        }
        this.select.setOnClickListener(new View.OnClickListener() { // from class: com.developer.filepicker.view.FilePickerDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String[] selectedPaths = MarkedItemList.getSelectedPaths();
                if (FilePickerDialog.this.callbacks != null) {
                    FilePickerDialog.this.callbacks.onSelectedFilePaths(selectedPaths);
                }
                FilePickerDialog.this.dismiss();
            }
        });
        button.setOnClickListener(new View.OnClickListener() { // from class: com.developer.filepicker.view.FilePickerDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FilePickerDialog.this.cancel();
            }
        });
        FileListAdapter fileListAdapter = new FileListAdapter(this.internalList, this.context, this.properties);
        this.mFileListAdapter = fileListAdapter;
        fileListAdapter.setNotifyItemCheckedListener(new NotifyItemChecked() { // from class: com.developer.filepicker.view.FilePickerDialog.3
            @Override // com.developer.filepicker.controller.NotifyItemChecked
            public void notifyCheckBoxIsClicked() {
                FilePickerDialog filePickerDialog = FilePickerDialog.this;
                filePickerDialog.positiveBtnNameStr = filePickerDialog.positiveBtnNameStr == null ? FilePickerDialog.this.context.getResources().getString(R.string.choose_button_label) : FilePickerDialog.this.positiveBtnNameStr;
                int fileCount = MarkedItemList.getFileCount();
                if (fileCount == 0) {
                    FilePickerDialog.this.select.setEnabled(false);
                    int color2 = FilePickerDialog.this.context.getResources().getColor(R.color.colorAccent, FilePickerDialog.this.context.getTheme());
                    FilePickerDialog.this.select.setTextColor(Color.argb(128, Color.red(color2), Color.green(color2), Color.blue(color2)));
                    FilePickerDialog.this.select.setText(FilePickerDialog.this.positiveBtnNameStr);
                } else {
                    FilePickerDialog.this.select.setEnabled(true);
                    FilePickerDialog.this.select.setTextColor(FilePickerDialog.this.context.getResources().getColor(R.color.colorAccent, FilePickerDialog.this.context.getTheme()));
                    FilePickerDialog.this.select.setText(FilePickerDialog.this.positiveBtnNameStr + " (" + fileCount + ") ");
                }
                if (FilePickerDialog.this.properties.selection_mode == 0) {
                    FilePickerDialog.this.mFileListAdapter.notifyDataSetChanged();
                }
            }
        });
        this.listView.setAdapter((ListAdapter) this.mFileListAdapter);
        setTitle();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        if (this.internalList.size() > i10) {
            FileListItem fileListItem = this.internalList.get(i10);
            if (!fileListItem.isDirectory()) {
                ((MaterialCheckbox) view.findViewById(R.id.file_mark)).performClick();
                return;
            }
            if (!new File(fileListItem.getLocation()).canRead()) {
                Toast.makeText(this.context, R.string.error_dir_access, 0).show();
                return;
            }
            File file = new File(fileListItem.getLocation());
            this.dname.setText(file.getName());
            setTitle();
            this.dir_path.setText(file.getAbsolutePath());
            this.internalList.clear();
            if (!file.getName().equals(this.properties.root.getName())) {
                FileListItem fileListItem2 = new FileListItem();
                fileListItem2.setFilename(this.context.getString(R.string.label_parent_dir));
                fileListItem2.setDirectory(true);
                fileListItem2.setLocation(file.getParentFile().getAbsolutePath());
                fileListItem2.setTime(file.lastModified());
                this.internalList.add(fileListItem2);
            }
            this.internalList = Utility.prepareFileListEntries(this.internalList, file, this.filter, this.properties.show_hidden_files);
            this.mFileListAdapter.notifyDataSetChanged();
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        File file;
        super.onStart();
        String string = this.positiveBtnNameStr;
        if (string == null) {
            string = this.context.getResources().getString(R.string.choose_button_label);
        }
        this.positiveBtnNameStr = string;
        this.select.setText(string);
        if (Utility.checkStorageAccessPermissions(this.context)) {
            this.internalList.clear();
            if (this.properties.offset.isDirectory() && validateOffsetPath()) {
                file = new File(this.properties.offset.getAbsolutePath());
                FileListItem fileListItem = new FileListItem();
                fileListItem.setFilename(this.context.getString(R.string.label_parent_dir));
                fileListItem.setDirectory(true);
                fileListItem.setLocation(file.getParentFile().getAbsolutePath());
                fileListItem.setTime(file.lastModified());
                this.internalList.add(fileListItem);
            } else {
                file = (this.properties.root.exists() && this.properties.root.isDirectory()) ? new File(this.properties.root.getAbsolutePath()) : new File(this.properties.error_dir.getAbsolutePath());
            }
            this.dname.setText(file.getName());
            this.dir_path.setText(file.getAbsolutePath());
            setTitle();
            this.internalList = Utility.prepareFileListEntries(this.internalList, file, this.filter, this.properties.show_hidden_files);
            this.mFileListAdapter.notifyDataSetChanged();
            this.listView.setOnItemClickListener(this);
        }
    }

    public void setDialogSelectionListener(DialogSelectionListener dialogSelectionListener) {
        this.callbacks = dialogSelectionListener;
    }

    public void setNegativeBtnName(CharSequence charSequence) {
        this.negativeBtnNameStr = charSequence != null ? charSequence.toString() : null;
    }

    public void setPositiveBtnName(CharSequence charSequence) {
        this.positiveBtnNameStr = charSequence != null ? charSequence.toString() : null;
    }

    public void setProperties(DialogProperties dialogProperties) {
        this.properties = dialogProperties;
        this.filter = new ExtensionFilter(dialogProperties);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.titleStr = charSequence != null ? charSequence.toString() : null;
        setTitle();
    }

    @Override // android.app.Dialog
    public void show() {
        if (!Utility.checkStorageAccessPermissions(this.context)) {
            ((Activity) this.context).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 112);
            return;
        }
        super.show();
        String string = this.positiveBtnNameStr;
        if (string == null) {
            string = this.context.getResources().getString(R.string.choose_button_label);
        }
        this.positiveBtnNameStr = string;
        this.select.setText(string);
        int fileCount = MarkedItemList.getFileCount();
        if (fileCount == 0) {
            this.select.setText(this.positiveBtnNameStr);
            return;
        }
        this.select.setText(this.positiveBtnNameStr + " (" + fileCount + ") ");
    }
}
