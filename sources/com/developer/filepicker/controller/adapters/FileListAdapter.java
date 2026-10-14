package com.developer.filepicker.controller.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.developer.filepicker.R;
import com.developer.filepicker.controller.NotifyItemChecked;
import com.developer.filepicker.model.DialogProperties;
import com.developer.filepicker.model.FileListItem;
import com.developer.filepicker.model.MarkedItemList;
import com.developer.filepicker.widget.MaterialCheckbox;
import com.developer.filepicker.widget.OnCheckedChangeListener;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class FileListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<FileListItem> listItem;
    private NotifyItemChecked notifyItemChecked;
    private DialogProperties properties;

    public class ViewHolder {
        public MaterialCheckbox fmark;
        public TextView name;
        public TextView type;
        public ImageView type_icon;

        public ViewHolder(View view) {
            this.name = (TextView) view.findViewById(R.id.fname);
            this.type = (TextView) view.findViewById(R.id.ftype);
            this.type_icon = (ImageView) view.findViewById(R.id.image_type);
            this.fmark = (MaterialCheckbox) view.findViewById(R.id.file_mark);
        }
    }

    public FileListAdapter(ArrayList<FileListItem> arrayList, Context context, DialogProperties dialogProperties) {
        this.listItem = arrayList;
        this.context = context;
        this.properties = dialogProperties;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.listItem.size();
    }

    @Override // android.widget.Adapter
    public FileListItem getItem(int i10) {
        return this.listItem.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0091  */
    /* JADX WARN: Code duplicated, block: B:18:0x0097  */
    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        Context context;
        int i11;
        if (view == null) {
            view = LayoutInflater.from(this.context).inflate(R.layout.dialog_file_list_item, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        final FileListItem fileListItem = this.listItem.get(i10);
        if (MarkedItemList.hasItem(fileListItem.getLocation())) {
            context = this.context;
            i11 = R.anim.marked_item_animation;
        } else {
            context = this.context;
            i11 = R.anim.unmarked_item_animation;
        }
        view.setAnimation(AnimationUtils.loadAnimation(context, i11));
        if (fileListItem.isDirectory()) {
            viewHolder.type_icon.setImageResource(R.mipmap.ic_type_folder);
            viewHolder.type_icon.setColorFilter(this.context.getResources().getColor(R.color.colorPrimary, this.context.getTheme()));
            if (this.properties.selection_type == 0) {
                viewHolder.fmark.setVisibility(4);
            } else {
                viewHolder.fmark.setVisibility(0);
            }
        } else {
            viewHolder.type_icon.setImageResource(R.mipmap.ic_type_file);
            viewHolder.type_icon.setColorFilter(this.context.getResources().getColor(R.color.colorAccent, this.context.getTheme()));
            if (this.properties.selection_type == 1) {
                viewHolder.fmark.setVisibility(4);
            } else {
                viewHolder.fmark.setVisibility(0);
            }
        }
        viewHolder.type_icon.setContentDescription(fileListItem.getFilename());
        viewHolder.name.setText(fileListItem.getFilename());
        DateFormat mediumDateFormat = android.text.format.DateFormat.getMediumDateFormat(this.context);
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(this.context);
        Date date = new Date(fileListItem.getTime());
        if (i10 == 0 && fileListItem.getFilename().startsWith(this.context.getString(R.string.label_parent_dir))) {
            viewHolder.type.setText(R.string.label_parent_directory);
        } else {
            viewHolder.type.setText(String.format(this.context.getString(R.string.last_edit), mediumDateFormat.format(date), timeFormat.format(date)));
        }
        if (viewHolder.fmark.getVisibility() == 0) {
            if (i10 == 0 && fileListItem.getFilename().startsWith(this.context.getString(R.string.label_parent_dir))) {
                viewHolder.fmark.setVisibility(4);
            }
            if (MarkedItemList.hasItem(fileListItem.getLocation())) {
                viewHolder.fmark.setChecked(true);
            } else {
                viewHolder.fmark.setChecked(false);
            }
        }
        viewHolder.fmark.setOnCheckedChangedListener(new OnCheckedChangeListener() { // from class: com.developer.filepicker.controller.adapters.FileListAdapter.1
            @Override // com.developer.filepicker.widget.OnCheckedChangeListener
            public void onCheckedChanged(MaterialCheckbox materialCheckbox, boolean z10) {
                fileListItem.setMarked(z10);
                if (!fileListItem.isMarked()) {
                    MarkedItemList.removeSelectedItem(fileListItem.getLocation());
                } else if (FileListAdapter.this.properties.selection_mode == 1) {
                    MarkedItemList.addSelectedItem(fileListItem);
                } else {
                    MarkedItemList.addSingleFile(fileListItem);
                }
                FileListAdapter.this.notifyItemChecked.notifyCheckBoxIsClicked();
            }
        });
        return view;
    }

    public void setNotifyItemCheckedListener(NotifyItemChecked notifyItemChecked) {
        this.notifyItemChecked = notifyItemChecked;
    }
}
