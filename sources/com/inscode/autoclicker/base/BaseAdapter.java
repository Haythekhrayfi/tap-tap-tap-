package com.inscode.autoclicker.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import fd.j0;
import java.util.ArrayList;
import java.util.List;
import jc.w;
import uc.l;
import uc.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseAdapter<T> extends RecyclerView.g<BaseViewHolder> {
    private final int layoutId;
    private p<? super View, ? super T, w> onBind = BaseAdapter$onBind$1.INSTANCE;
    private l<? super T, w> onItemClick = BaseAdapter$onItemClick$1.INSTANCE;
    private p<? super T, ? super T, Boolean> onCompare = BaseAdapter$onCompare$1.INSTANCE;
    private p<? super T, ? super T, Boolean> onContentCompare = BaseAdapter$onContentCompare$1.INSTANCE;
    private List<T> data = new ArrayList();

    public static final class BaseViewHolder extends RecyclerView.c0 {
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseViewHolder(View view) {
            super(view);
            j0.i(view, "view");
            this.view = view;
        }

        public final View getView() {
            return this.view;
        }
    }

    public static class Builder<T> {
        private int layoutId;
        private p<? super View, ? super T, w> bindingFunction = BaseAdapter$Builder$bindingFunction$1.INSTANCE;
        private l<? super T, w> itemClickFunction = BaseAdapter$Builder$itemClickFunction$1.INSTANCE;
        private p<? super T, ? super T, Boolean> compareFunction = BaseAdapter$Builder$compareFunction$1.INSTANCE;
        private p<? super T, ? super T, Boolean> contentCompareFunction = BaseAdapter$Builder$contentCompareFunction$1.INSTANCE;

        public final BaseAdapter<T> build() {
            final int i10 = this.layoutId;
            BaseAdapter<T> baseAdapter = new BaseAdapter<T>(i10) { // from class: com.inscode.autoclicker.base.BaseAdapter$Builder$build$1
            };
            baseAdapter.setOnBind(this.bindingFunction);
            baseAdapter.setOnItemClick(this.itemClickFunction);
            baseAdapter.setOnCompare(this.compareFunction);
            baseAdapter.setOnContentCompare(this.contentCompareFunction);
            return baseAdapter;
        }

        public final Builder<T> layoutId(int i10) {
            this.layoutId = i10;
            return this;
        }

        public final Builder<T> onBind(p<? super View, ? super T, w> pVar) {
            j0.i(pVar, "bindingFunction");
            this.bindingFunction = pVar;
            return this;
        }

        public final Builder<T> onCompare(p<? super T, ? super T, Boolean> pVar) {
            j0.i(pVar, "compareFunction");
            this.compareFunction = pVar;
            return this;
        }

        public final Builder<T> onContentCompare(p<? super T, ? super T, Boolean> pVar) {
            j0.i(pVar, "compareFunction");
            this.contentCompareFunction = pVar;
            return this;
        }

        public final Builder<T> onItemClick(l<? super T, w> lVar) {
            j0.i(lVar, "itemClickFunction");
            this.itemClickFunction = lVar;
            return this;
        }
    }

    public BaseAdapter(int i10) {
        this.layoutId = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(BaseAdapter baseAdapter, Object obj, View view) {
        j0.i(baseAdapter, "this$0");
        baseAdapter.onItemClick.invoke(obj);
    }

    public void add(T t10) {
        getData().add(t10);
        notifyItemInserted(getData().indexOf(t10));
    }

    public void add(List<? extends T> list) {
        j0.i(list, "list");
        getData().addAll(list);
        int size = getData().size();
        notifyItemRangeInserted(size, list.size() + size);
    }

    public List<T> getAll() {
        return getData();
    }

    public List<T> getData() {
        return this.data;
    }

    public T getItem(int i10) {
        return getData().get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return getData().size();
    }

    public p<View, T, w> getOnBind() {
        return this.onBind;
    }

    public final p<T, T, Boolean> getOnCompare() {
        return this.onCompare;
    }

    public final p<T, T, Boolean> getOnContentCompare() {
        return this.onContentCompare;
    }

    public final l<T, w> getOnItemClick() {
        return this.onItemClick;
    }

    public int getPosition(T t10) {
        return getData().indexOf(t10);
    }

    public boolean hasItems() {
        return !getData().isEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(BaseViewHolder baseViewHolder, int i10) {
        j0.i(baseViewHolder, "holder");
        T t10 = getData().get(i10);
        baseViewHolder.itemView.setOnClickListener(new a(this, t10));
        p<View, T, w> onBind = getOnBind();
        View view = baseViewHolder.itemView;
        j0.h(view, "holder.itemView");
        onBind.invoke(view, t10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        j0.i(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.layoutId, viewGroup, false);
        j0.h(viewInflate, "from(parent.context).inf…(layoutId, parent, false)");
        return new BaseViewHolder(viewInflate);
    }

    public void remove(T t10) {
        int iIndexOf = getData().indexOf(t10);
        getData().remove(t10);
        notifyItemRemoved(iIndexOf);
    }

    public void removeAll() {
        getData().clear();
        notifyDataSetChanged();
    }

    public void removeAt(int i10) {
        getData().remove(i10);
        notifyItemRemoved(i10);
    }

    public void setAll(List<? extends T> list) {
        j0.i(list, "item");
        getData().clear();
        getData().addAll(list);
        notifyDataSetChanged();
    }

    public void setData(List<T> list) {
        j0.i(list, "<set-?>");
        this.data = list;
    }

    public void setOnBind(p<? super View, ? super T, w> pVar) {
        j0.i(pVar, "<set-?>");
        this.onBind = pVar;
    }

    public final void setOnCompare(p<? super T, ? super T, Boolean> pVar) {
        j0.i(pVar, "<set-?>");
        this.onCompare = pVar;
    }

    public final void setOnContentCompare(p<? super T, ? super T, Boolean> pVar) {
        j0.i(pVar, "<set-?>");
        this.onContentCompare = pVar;
    }

    public final void setOnItemClick(l<? super T, w> lVar) {
        j0.i(lVar, "<set-?>");
        this.onItemClick = lVar;
    }

    public void update(final List<? extends T> list) {
        j0.i(list, "items");
        final List<T> data = getData();
        androidx.recyclerview.widget.l.c cVarA = androidx.recyclerview.widget.l.a(new androidx.recyclerview.widget.l.b() { // from class: com.inscode.autoclicker.base.BaseAdapter$update$diffResult$1
            @Override // androidx.recyclerview.widget.l.b
            public boolean areContentsTheSame(int i10, int i11) {
                return ((Boolean) this.getOnContentCompare().invoke(data.get(i10), list.get(i11))).booleanValue();
            }

            @Override // androidx.recyclerview.widget.l.b
            public boolean areItemsTheSame(int i10, int i11) {
                return ((Boolean) this.getOnCompare().invoke(data.get(i10), list.get(i11))).booleanValue();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int getNewListSize() {
                return list.size();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int getOldListSize() {
                return data.size();
            }
        }, true);
        getData().clear();
        getData().addAll(list);
        cVarA.a(this);
    }
}
