package com.applovin.mediation.nativeAds.adPlacer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.applovin.impl.mediation.nativeAds.a.c;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class MaxRecyclerAdapter extends RecyclerView.g<RecyclerView.c0> implements MaxAdPlacer.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdPlacer f11564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RecyclerView.g f11565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f11566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RecyclerView f11567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f11568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxAdPlacer.Listener f11569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AdPositionBehavior f11571h;

    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    public static class MaxAdRecyclerViewHolder extends RecyclerView.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f11574a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f11574a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f11574a;
        }
    }

    public class a extends RecyclerView.i {
        private a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        @SuppressLint({"NotifyDataSetChanged"})
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int i10, int i11) {
            int adjustedPosition = MaxRecyclerAdapter.this.f11564a.getAdjustedPosition(i10);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f11564a.getAdjustedPosition((i10 + i11) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        @SuppressLint({"NotifyDataSetChanged"})
        public void onItemRangeInserted(int i10, int i11) {
            int i12 = 0;
            boolean z10 = i10 + i11 >= MaxRecyclerAdapter.this.f11565b.getItemCount();
            if (MaxRecyclerAdapter.this.f11571h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f11571h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f11564a.getAdjustedPosition(i10);
            while (true) {
                MaxRecyclerAdapter maxRecyclerAdapter = MaxRecyclerAdapter.this;
                if (i12 >= i11) {
                    maxRecyclerAdapter.notifyItemRangeInserted(adjustedPosition, i11);
                    return;
                } else {
                    maxRecyclerAdapter.f11564a.insertItem(adjustedPosition);
                    i12++;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        @SuppressLint({"NotifyDataSetChanged"})
        public void onItemRangeMoved(int i10, int i11, int i12) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        @SuppressLint({"NotifyDataSetChanged"})
        public void onItemRangeRemoved(int i10, int i11) {
            int itemCount = MaxRecyclerAdapter.this.f11565b.getItemCount();
            boolean z10 = i10 + i11 >= itemCount;
            if (MaxRecyclerAdapter.this.f11571h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f11571h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z10)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f11564a.getAdjustedPosition(i10);
            int adjustedCount = MaxRecyclerAdapter.this.f11564a.getAdjustedCount(itemCount + i11);
            for (int i12 = 0; i12 < i11; i12++) {
                MaxRecyclerAdapter.this.f11564a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f11564a.getAdjustedCount(itemCount);
            int size = adjustedCount - adjustedCount2;
            Collection<Integer> collectionClearTrailingAds = MaxRecyclerAdapter.this.f11564a.clearTrailingAds(adjustedCount2 - 1);
            if (!collectionClearTrailingAds.isEmpty()) {
                size += collectionClearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (size - i11), size);
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.g gVar, Activity activity) {
        a aVar = new a();
        this.f11566c = aVar;
        this.f11570g = 8;
        this.f11571h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f11564a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(gVar.hasStableIds());
        this.f11565b = gVar;
        gVar.registerAdapterDataObserver(aVar);
    }

    private int a(int i10) {
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f11567d.getContext(), this.f11567d.getWidth());
        RecyclerView.o layoutManager = this.f11567d.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            return layoutManager instanceof StaggeredGridLayoutManager ? iPxToDp / ((StaggeredGridLayoutManager) layoutManager).f2519a : iPxToDp;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        return (iPxToDp / gridLayoutManager.f2415b) * gridLayoutManager.f2420g.c(i10);
    }

    public void destroy() {
        try {
            this.f11565b.unregisterAdapterDataObserver(this.f11566c);
        } catch (Exception unused) {
        }
        this.f11564a.destroy();
        c cVar = this.f11568e;
        if (cVar != null) {
            cVar.a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f11564a;
    }

    public int getAdjustedPosition(int i10) {
        return this.f11564a.getAdjustedPosition(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return this.f11564a.getAdjustedCount(this.f11565b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long getItemId(int i10) {
        if (this.f11565b.hasStableIds()) {
            return this.f11564a.isFilledPosition(i10) ? this.f11564a.getAdItemId(i10) : this.f11565b.getItemId(this.f11564a.getOriginalPosition(i10));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int i10) {
        if (this.f11564a.isAdPosition(i10)) {
            return -42;
        }
        return this.f11565b.getItemViewType(this.f11564a.getOriginalPosition(i10));
    }

    public int getOriginalPosition(int i10) {
        return this.f11564a.getOriginalPosition(i10);
    }

    public void loadAds() {
        this.f11564a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f11569f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i10) {
        notifyItemChanged(i10);
        MaxAdPlacer.Listener listener = this.f11569f;
        if (listener != null) {
            listener.onAdLoaded(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i10) {
        MaxAdPlacer.Listener listener = this.f11569f;
        if (listener != null) {
            listener.onAdRemoved(i10);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f11569f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f11567d = recyclerView;
        c cVar = new c(recyclerView);
        this.f11568e = cVar;
        cVar.a(new c.a() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.1
            @Override // com.applovin.impl.mediation.nativeAds.a.c.a
            public void a(int i10, int i11) {
                MaxRecyclerAdapter.this.f11564a.updateFillablePositions(i10, Math.min(MaxRecyclerAdapter.this.f11570g + i11, MaxRecyclerAdapter.this.getItemCount() - 1));
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(RecyclerView.c0 c0Var, int i10) {
        this.f11568e.a(c0Var.itemView, i10);
        if (!this.f11564a.isAdPosition(i10)) {
            this.f11565b.onBindViewHolder(c0Var, this.f11564a.getOriginalPosition(i10));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f11564a.getAdSize(i10, a(i10));
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) c0Var).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.f11564a.renderAd(i10, containerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 != -42) {
            return this.f11565b.onCreateViewHolder(viewGroup, i10);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        RecyclerView.o layoutManager = this.f11567d.getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        viewInflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f11567d = null;
        c cVar = this.f11568e;
        if (cVar != null) {
            cVar.a();
            this.f11568e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public boolean onFailedToRecycleView(RecyclerView.c0 c0Var) {
        return c0Var instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(c0Var) : this.f11565b.onFailedToRecycleView(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(RecyclerView.c0 c0Var) {
        if (c0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(c0Var);
        } else {
            this.f11565b.onViewAttachedToWindow(c0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(RecyclerView.c0 c0Var) {
        if (c0Var instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(c0Var);
        } else {
            this.f11565b.onViewDetachedFromWindow(c0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewRecycled(RecyclerView.c0 c0Var) {
        c cVar = this.f11568e;
        if (cVar != null) {
            cVar.a(c0Var.itemView);
        }
        if (!(c0Var instanceof MaxAdRecyclerViewHolder)) {
            this.f11565b.onViewRecycled(c0Var);
            return;
        }
        if (this.f11564a.isFilledPosition(c0Var.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) c0Var).getContainerView().removeAllViews();
        }
        super.onViewRecycled(c0Var);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f11571h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void setHasStableIds(boolean z10) {
        super.setHasStableIds(z10);
        this.f11565b.unregisterAdapterDataObserver(this.f11566c);
        this.f11565b.setHasStableIds(z10);
        this.f11565b.registerAdapterDataObserver(this.f11566c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f11569f = listener;
    }

    public void setLookAhead(int i10) {
        this.f11570g = i10;
    }
}
