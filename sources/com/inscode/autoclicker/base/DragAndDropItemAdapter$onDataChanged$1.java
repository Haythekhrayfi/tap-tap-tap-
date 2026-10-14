package com.inscode.autoclicker.base;

import fd.j0;
import java.util.List;
import jc.w;
import vc.l;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
public final class DragAndDropItemAdapter$onDataChanged$1<T> extends l implements uc.l<List<? extends T>, w> {
    public static final DragAndDropItemAdapter$onDataChanged$1 INSTANCE = new DragAndDropItemAdapter$onDataChanged$1();

    public DragAndDropItemAdapter$onDataChanged$1() {
        super(1);
    }

    @Override // uc.l
    public /* bridge */ /* synthetic */ w invoke(Object obj) {
        invoke((List) obj);
        return w.f31842a;
    }

    public final void invoke(List<? extends T> list) {
        j0.i(list, "it");
    }
}
