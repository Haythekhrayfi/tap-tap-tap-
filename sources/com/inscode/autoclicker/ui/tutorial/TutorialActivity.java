package com.inscode.autoclicker.ui.tutorial;

import a3.j;
import ae.b;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.c;
import androidx.viewpager2.widget.ViewPager2;
import com.inscode.autoclicker.R;
import com.inscode.autoclicker.base.BaseActivity;
import com.inscode.autoclicker.base.BaseAdapter;
import fd.j0;
import g3.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.e;
import jc.f;
import k7.g;

/* JADX INFO: loaded from: classes2.dex */
public final class TutorialActivity extends BaseActivity {
    private int currentAdapterPosition;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final e tutorialPreference$delegate = f.b(new TutorialActivity$special$$inlined$inject$default$1(this, "", null, b.f348c));
    private final BaseAdapter<Tutorial> adapter = new BaseAdapter.Builder().layoutId(R.layout.item_tutorial).onBind(new TutorialActivity$adapter$1(this)).build();

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindTutorialPage(View view, Tutorial tutorial) {
        Context applicationContext;
        int i10;
        View viewInflate;
        j jVarB;
        String str;
        j0.g(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((FrameLayout) view).removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        c cVar = new c(this);
        cVar.b(5.0f);
        cVar.f2900c.f2921q = 30.0f;
        cVar.invalidateSelf();
        cVar.start();
        switch (tutorial.getKey()) {
            case "start":
                applicationContext = getApplicationContext();
                i10 = R.layout.item_tutorial_start;
                ((FrameLayout) view.findViewById(R.id.itemTutorialContainer)).addView(View.inflate(applicationContext, i10, null), layoutParams);
                return;
            case "manual_1":
                applicationContext = getApplicationContext();
                i10 = R.layout.item_tutorial_manual_1;
                ((FrameLayout) view.findViewById(R.id.itemTutorialContainer)).addView(View.inflate(applicationContext, i10, null), layoutParams);
                return;
            case "manual_2":
                viewInflate = View.inflate(getApplicationContext(), R.layout.item_tutorial_gif, null);
                ((FrameLayout) view.findViewById(R.id.itemTutorialContainer)).addView(viewInflate, layoutParams);
                jVarB = a3.c.b(this).f18h.b(this);
                str = "https://i.imgur.com/Zx5rz4s.gif";
                break;
            case "recording_1":
                applicationContext = getApplicationContext();
                i10 = R.layout.item_tutorial_recording_1;
                ((FrameLayout) view.findViewById(R.id.itemTutorialContainer)).addView(View.inflate(applicationContext, i10, null), layoutParams);
                return;
            case "recording_2":
                viewInflate = View.inflate(getApplicationContext(), R.layout.item_tutorial_gif, null);
                ((FrameLayout) view.findViewById(R.id.itemTutorialContainer)).addView(viewInflate, layoutParams);
                jVarB = a3.c.b(this).f18h.b(this);
                str = "https://i.imgur.com/132WgWr.gif";
                break;
            default:
                return;
        }
        jVarB.j(str).e(k.f29859a).i(cVar).u((ImageView) viewInflate.findViewById(R.id.itemTutorialImage));
    }

    private final i7.f getTutorialPreference() {
        return (i7.f) this.tutorialPreference$delegate.getValue();
    }

    private final void goNext() {
        if (this.adapter.getItemCount() != this.currentAdapterPosition + 1) {
            ((ViewPager2) _$_findCachedViewById(R.id.tutorialViewPager)).e(this.currentAdapterPosition + 1, true);
        } else {
            g.b(getTutorialPreference().f31300a, Boolean.TRUE);
            finish();
        }
    }

    private final void goPrevious() {
        if (this.currentAdapterPosition != 0) {
            ((ViewPager2) _$_findCachedViewById(R.id.tutorialViewPager)).e(this.currentAdapterPosition - 1, true);
        }
    }

    private final void prepareButtons() {
        final int i10 = 0;
        ((ImageView) _$_findCachedViewById(R.id.tutorialArrowLeft)).setOnClickListener(new View.OnClickListener(this) { // from class: com.inscode.autoclicker.ui.tutorial.a

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ TutorialActivity f13391d;

            {
                this.f13391d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        TutorialActivity.prepareButtons$lambda$0(this.f13391d, view);
                        break;
                    case 1:
                        TutorialActivity.prepareButtons$lambda$1(this.f13391d, view);
                        break;
                    default:
                        TutorialActivity.prepareButtons$lambda$2(this.f13391d, view);
                        break;
                }
            }
        });
        final int i11 = 1;
        ((ImageView) _$_findCachedViewById(R.id.tutorialArrowRight)).setOnClickListener(new View.OnClickListener(this) { // from class: com.inscode.autoclicker.ui.tutorial.a

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ TutorialActivity f13391d;

            {
                this.f13391d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        TutorialActivity.prepareButtons$lambda$0(this.f13391d, view);
                        break;
                    case 1:
                        TutorialActivity.prepareButtons$lambda$1(this.f13391d, view);
                        break;
                    default:
                        TutorialActivity.prepareButtons$lambda$2(this.f13391d, view);
                        break;
                }
            }
        });
        final int i12 = 2;
        ((TextView) _$_findCachedViewById(R.id.tutorialSkipButton)).setOnClickListener(new View.OnClickListener(this) { // from class: com.inscode.autoclicker.ui.tutorial.a

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ TutorialActivity f13391d;

            {
                this.f13391d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        TutorialActivity.prepareButtons$lambda$0(this.f13391d, view);
                        break;
                    case 1:
                        TutorialActivity.prepareButtons$lambda$1(this.f13391d, view);
                        break;
                    default:
                        TutorialActivity.prepareButtons$lambda$2(this.f13391d, view);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareButtons$lambda$0(TutorialActivity tutorialActivity, View view) {
        j0.i(tutorialActivity, "this$0");
        tutorialActivity.goPrevious();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareButtons$lambda$1(TutorialActivity tutorialActivity, View view) {
        j0.i(tutorialActivity, "this$0");
        tutorialActivity.goNext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareButtons$lambda$2(TutorialActivity tutorialActivity, View view) {
        j0.i(tutorialActivity, "this$0");
        g.b(tutorialActivity.getTutorialPreference().f31300a, Boolean.TRUE);
        tutorialActivity.finish();
    }

    private final void prepareTutorials() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Tutorial("manual_1"));
        arrayList.add(new Tutorial("manual_2"));
        arrayList.add(new Tutorial("recording_1"));
        arrayList.add(new Tutorial("recording_2"));
        if (!((Boolean) g.a(getTutorialPreference().f31300a, Boolean.FALSE)).booleanValue()) {
            arrayList.add(0, new Tutorial("start"));
            ((TextView) _$_findCachedViewById(R.id.tutorialSkipButton)).setText(getString(R.string.skip));
        }
        this.adapter.setAll(arrayList);
    }

    private final void prepareViewPager() {
        ((ViewPager2) _$_findCachedViewById(R.id.tutorialViewPager)).setAdapter(this.adapter);
        ViewPager2 viewPager2 = (ViewPager2) _$_findCachedViewById(R.id.tutorialViewPager);
        viewPager2.f3011e.f3049a.add(new ViewPager2.g() { // from class: com.inscode.autoclicker.ui.tutorial.TutorialActivity.prepareViewPager.1
            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageScrollStateChanged(int i10) {
                super.onPageScrollStateChanged(i10);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageScrolled(int i10, float f10, int i11) {
                super.onPageScrolled(i10, f10, i11);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g
            public void onPageSelected(int i10) {
                super.onPageSelected(i10);
                TutorialActivity.this.currentAdapterPosition = i10;
                TutorialActivity.this.updateButtonsVisibility(i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateButtonsVisibility(int i10) {
        ((ImageView) _$_findCachedViewById(R.id.tutorialArrowLeft)).setVisibility(i10 == 0 ? 4 : 0);
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.inscode.autoclicker.base.BaseActivity
    public int layoutId() {
        return R.layout.activity_tutorial;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.inscode.autoclicker.base.BaseActivity, androidx.fragment.app.n, androidx.activity.ComponentActivity, d0.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        prepareViewPager();
        prepareButtons();
        prepareTutorials();
    }
}
