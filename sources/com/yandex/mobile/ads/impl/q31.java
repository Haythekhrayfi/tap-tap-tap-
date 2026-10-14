package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.Menu;
import android.view.View;
import android.widget.PopupMenu;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class q31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private yr0 f24310a = new yr0();

    public final PopupMenu a(View view, g20 g20Var, List<f31> list) {
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view, 5);
        Objects.requireNonNull(this.f24310a);
        yr0.a(popupMenu);
        Menu menu = popupMenu.getMenu();
        Context context = view.getContext();
        for (int i10 = 0; i10 < list.size(); i10++) {
            h31 h31VarC = list.get(i10).c();
            menu.add(0, i10, i10, h31VarC.b()).setIcon(new BitmapDrawable(context.getResources(), g20Var.a(h31VarC.a())));
        }
        return popupMenu;
    }
}
