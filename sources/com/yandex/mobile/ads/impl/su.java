package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.PopupMenu;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class su {
    public static PopupMenu a(Context context, ImageView imageView, List list) {
        PopupMenu popupMenu = new PopupMenu(context, imageView, 5);
        Menu menu = popupMenu.getMenu();
        for (int i10 = 0; i10 < list.size(); i10++) {
            menu.add(0, i10, 0, ((ju.a) list.get(i10)).a());
        }
        return popupMenu;
    }
}
