package com.inscode.autoclicker.base;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import jc.w;
import uc.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DragAndDropItemAdapter<T> extends RecyclerView.g<te.b> {
    private p itemTouchHelper;
    private final int layoutId;
    private uc.p<? super View, ? super T, w> onBind = DragAndDropItemAdapter$onBind$1.INSTANCE;
    private l<? super T, w> onItemLongClick = DragAndDropItemAdapter$onItemLongClick$1.INSTANCE;
    private l<? super List<? extends T>, w> onDataChanged = DragAndDropItemAdapter$onDataChanged$1.INSTANCE;
    private List<T> data = new ArrayList();
    private final uc.p<Integer, Integer, w> onViewMoved = new DragAndDropItemAdapter$onViewMoved$1(this);

    public static class Builder<T> {
        private uc.p<? super View, ? super T, w> bindingFunction = DragAndDropItemAdapter$Builder$bindingFunction$1.INSTANCE;
        private l<? super List<? extends T>, w> dataChangedFunction = DragAndDropItemAdapter$Builder$dataChangedFunction$1.INSTANCE;
        private int layoutId;

        public final DragAndDropItemAdapter<T> build() {
            final int i10 = this.layoutId;
            DragAndDropItemAdapter<T> dragAndDropItemAdapter = new DragAndDropItemAdapter<T>(i10) { // from class: com.inscode.autoclicker.base.DragAndDropItemAdapter$Builder$build$1
            };
            dragAndDropItemAdapter.setOnBind(this.bindingFunction);
            dragAndDropItemAdapter.setOnDataChanged(this.dataChangedFunction);
            return dragAndDropItemAdapter;
        }

        public final Builder<T> layoutId(int i10) {
            this.layoutId = i10;
            return this;
        }

        public final Builder<T> onBind(uc.p<? super View, ? super T, w> pVar) {
            j0.i(pVar, "bindingFunction");
            this.bindingFunction = pVar;
            return this;
        }

        public final Builder<T> onDataChanged(l<? super List<? extends T>, w> lVar) {
            j0.i(lVar, "dataChangedFunction");
            this.dataChangedFunction = lVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.inscode.autoclicker.base.DragAndDropItemAdapter$onCreateViewHolder$1, reason: invalid class name */
    public static final class AnonymousClass1 extends vc.l implements uc.a<w> {
        public final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(View view) {
            super(0);
            this.$view = view;
        }

        @Override // uc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$view.setBackgroundResource(R.drawable.dragged_menu_item_background);
        }
    }

    /* JADX INFO: renamed from: com.inscode.autoclicker.base.DragAndDropItemAdapter$onCreateViewHolder$2, reason: invalid class name */
    public static final class AnonymousClass2 extends vc.l implements uc.a<w> {
        public final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(View view) {
            super(0);
            this.$view = view;
        }

        @Override // uc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f31842a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$view.setBackgroundColor(0);
        }
    }

    public DragAndDropItemAdapter(int i10) {
        this.layoutId = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBindViewHolder$lambda$0(DragAndDropItemAdapter dragAndDropItemAdapter, te.b bVar, View view) {
        String str;
        j0.i(dragAndDropItemAdapter, "this$0");
        j0.i(bVar, "$holder");
        p pVar = dragAndDropItemAdapter.itemTouchHelper;
        if (pVar != null) {
            if (!((pVar.f2743m.d(pVar.f2748r, bVar) & 16711680) != 0)) {
                str = "Start drag has been called but dragging is not enabled";
            } else if (bVar.itemView.getParent() != pVar.f2748r) {
                str = "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.";
            } else {
                VelocityTracker velocityTracker = pVar.f2750t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                pVar.f2750t = VelocityTracker.obtain();
                pVar.f2739i = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                pVar.f2738h = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                pVar.o(bVar, 2);
            }
            Log.e("ItemTouchHelper", str);
        }
        return true;
    }

    public List<T> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return getData().size();
    }

    public uc.p<View, T, w> getOnBind() {
        return this.onBind;
    }

    public final l<List<? extends T>, w> getOnDataChanged() {
        return this.onDataChanged;
    }

    public final l<T, w> getOnItemLongClick() {
        return this.onItemLongClick;
    }

    public final uc.p<Integer, Integer, w> getOnViewMoved() {
        return this.onViewMoved;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(final te.b bVar, int i10) {
        j0.i(bVar, "holder");
        T t10 = getData().get(i10);
        bVar.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.inscode.autoclicker.base.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return DragAndDropItemAdapter.onBindViewHolder$lambda$0(this.f13041c, bVar, view);
            }
        });
        uc.p<View, T, w> onBind = getOnBind();
        View view = bVar.itemView;
        j0.h(view, "holder.itemView");
        onBind.invoke(view, t10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public te.b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        j0.i(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.layoutId, viewGroup, false);
        j0.h(viewInflate, "view");
        return new te.b(viewInflate, new AnonymousClass1(viewInflate), new AnonymousClass2(viewInflate));
    }

    public void remove(T t10) {
        int iIndexOf = getData().indexOf(t10);
        getData().remove(t10);
        notifyItemRemoved(iIndexOf);
    }

    public void setAll(List<? extends T> list) {
        if (list == null) {
            return;
        }
        getData().clear();
        getData().addAll(list);
        notifyDataSetChanged();
    }

    public void setData(List<T> list) {
        j0.i(list, "<set-?>");
        this.data = list;
    }

    public final void setItemTouchHelper(p pVar) {
        j0.i(pVar, "itemTouchHelper");
        this.itemTouchHelper = pVar;
    }

    public void setOnBind(uc.p<? super View, ? super T, w> pVar) {
        j0.i(pVar, "<set-?>");
        this.onBind = pVar;
    }

    public final void setOnDataChanged(l<? super List<? extends T>, w> lVar) {
        j0.i(lVar, "<set-?>");
        this.onDataChanged = lVar;
    }

    public final void setOnItemLongClick(l<? super T, w> lVar) {
        j0.i(lVar, "<set-?>");
        this.onItemLongClick = lVar;
    }
}
