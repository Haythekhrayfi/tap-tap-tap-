package com.applovin.impl.mediation.debugger.ui.d;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.impl.sdk.utils.g;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends BaseAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<c> f9749a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<Integer, Integer> f9750b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f9751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f9752d;

    public interface a {
        void onClick(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar);
    }

    public d(Context context) {
        this.f9751c = context.getApplicationContext();
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(g.a(R.color.applovin_sdk_highlightListItemColor, this.f9751c));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }

    private com.applovin.impl.mediation.debugger.ui.d.a e(int i10) {
        for (int i11 = 0; i11 < e(); i11++) {
            Integer num = this.f9750b.get(Integer.valueOf(i11));
            if (num != null) {
                if (i10 <= num.intValue() + a(i11)) {
                    return new com.applovin.impl.mediation.debugger.ui.d.a(i11, i10 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    public abstract int a(int i10);

    public void a(a aVar) {
        this.f9752d = aVar;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public abstract c b(int i10);

    public abstract List<c> c(int i10);

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c getItem(int i10) {
        return this.f9749a.get(i10);
    }

    public abstract int e();

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f9749a.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        return getItem(i10).i();
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        b bVar;
        c item = getItem(i10);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            bVar = new b();
            bVar.f9709a = (TextView) view.findViewById(android.R.id.text1);
            bVar.f9710b = (TextView) view.findViewById(android.R.id.text2);
            bVar.f9711c = (ImageView) view.findViewById(R.id.imageView);
            bVar.f9712d = (ImageView) view.findViewById(R.id.detailImageView);
            view.setTag(bVar);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            bVar = (b) view.getTag();
        }
        bVar.a(i10);
        bVar.a(item);
        view.setEnabled(item.c());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return c.h();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return getItem(i10).c();
    }

    public void m() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.d.d.1
            @Override // java.lang.Runnable
            public void run() {
                d.this.notifyDataSetChanged();
            }
        });
    }

    public c n() {
        return null;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i10;
        this.f9749a = new ArrayList();
        int iE = e();
        this.f9750b = new HashMap(iE);
        c cVarN = n();
        if (cVarN != null) {
            this.f9749a.add(cVarN);
            i10 = 1;
        } else {
            i10 = 0;
        }
        for (int i11 = 0; i11 < iE; i11++) {
            int iA = a(i11);
            if (iA != 0) {
                this.f9749a.add(b(i11));
                this.f9749a.addAll(c(i11));
                this.f9750b.put(Integer.valueOf(i11), Integer.valueOf(i10));
                i10 = iA + 1 + i10;
            }
        }
        this.f9749a.add(new e(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b bVar = (b) view.getTag();
        c cVarB = bVar.b();
        com.applovin.impl.mediation.debugger.ui.d.a aVarE = e(bVar.a());
        a aVar = this.f9752d;
        if (aVar == null || aVarE == null) {
            return;
        }
        aVar.onClick(aVarE, cVarB);
    }
}
