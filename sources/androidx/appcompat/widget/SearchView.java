package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import ch.qos.logback.core.net.SyslogConstants;
import com.developer.filepicker.model.DialogConfigs;
import com.inscode.autoclicker.R;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements i.b {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final o f1053a0;
    public n A;
    public View.OnClickListener B;
    public boolean C;
    public boolean D;
    public t0.a E;
    public boolean F;
    public CharSequence G;
    public boolean H;
    public boolean I;
    public int J;
    public boolean K;
    public CharSequence L;
    public CharSequence M;
    public boolean N;
    public int O;
    public SearchableInfo P;
    public Bundle Q;
    public final Runnable R;
    public Runnable S;
    public final WeakHashMap<String, Drawable.ConstantState> T;
    public final View.OnClickListener U;
    public View.OnKeyListener V;
    public TextWatcher W;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SearchAutoComplete f1054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f1055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f1056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f1057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f1058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f1059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f1060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f1061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f1062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f1063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Rect f1064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f1065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f1066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f1067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ImageView f1068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Drawable f1069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1070s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1071t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Intent f1072u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Intent f1073v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CharSequence f1074w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m f1075x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l f1076y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View.OnFocusChangeListener f1077z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1078c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1078c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("SearchView.SavedState{");
            sbA.append(Integer.toHexString(System.identityHashCode(this)));
            sbA.append(" isIconified=");
            sbA.append(this.f1078c);
            sbA.append("}");
            return sbA.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1078c));
        }
    }

    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SearchView f1080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f1081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Runnable f1082f;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f1081e) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f1081e = false;
                }
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1082f = new a();
            this.f1079c = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 >= 600) {
                return 192;
            }
            if (i10 < 640 || i11 < 480) {
                return SyslogConstants.LOG_LOCAL4;
            }
            return 192;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o oVar = SearchView.f1053a0;
            Objects.requireNonNull(oVar);
            o.a();
            Method method = oVar.f1096c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1079c <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1081e) {
                removeCallbacks(this.f1082f);
                post(this.f1082f);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f1080d;
            searchView.s(searchView.D);
            searchView.post(searchView.R);
            if (searchView.f1054c.hasFocus()) {
                searchView.f();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1080d.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1080d.hasFocus() && getVisibility() == 0) {
                this.f1081e = true;
                Context context = getContext();
                o oVar = SearchView.f1053a0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1081e = false;
                removeCallbacks(this.f1082f);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1081e = true;
                    return;
                }
                this.f1081e = false;
                removeCallbacks(this.f1082f);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1080d = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1079c = i10;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f1054c.getText();
            searchView.M = text;
            boolean z10 = !TextUtils.isEmpty(text);
            searchView.r(z10);
            searchView.t(!z10);
            searchView.n();
            searchView.q();
            if (searchView.f1075x != null && !TextUtils.equals(charSequence, searchView.L)) {
                searchView.f1075x.a(charSequence.toString());
            }
            searchView.L = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.o();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t0.a aVar = SearchView.this.E;
            if (aVar instanceof s0) {
                aVar.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1077z;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int dimensionPixelSize;
            SearchView searchView = SearchView.this;
            if (searchView.f1062k.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f1056e.getPaddingLeft();
                Rect rect = new Rect();
                boolean zB = g1.b(searchView);
                if (searchView.C) {
                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    dimensionPixelSize = 0;
                }
                searchView.f1054c.getDropDownBackground().getPadding(rect);
                searchView.f1054c.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f1054c.setDropDownWidth((((searchView.f1062k.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1058g) {
                searchView.l();
                return;
            }
            if (view == searchView.f1060i) {
                searchView.h();
                return;
            }
            if (view == searchView.f1059h) {
                searchView.m();
                return;
            }
            if (view != searchView.f1061j) {
                if (view == searchView.f1054c) {
                    searchView.f();
                    return;
                }
                return;
            }
            SearchableInfo searchableInfo = searchView.P;
            if (searchableInfo == null) {
                return;
            }
            try {
                if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.e(searchView.f1073v, searchableInfo));
                    }
                } else {
                    Intent intent = new Intent(searchView.f1072u);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.P == null) {
                return false;
            }
            if (!searchView.f1054c.isPopupShowing() || SearchView.this.f1054c.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(SearchView.this.f1054c.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.g(0, null, searchView2.f1054c.getText().toString());
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.P == null || searchView3.E == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return searchView3.i(searchView3.f1054c.getListSelection());
            }
            if (i10 != 21 && i10 != 22) {
                if (i10 != 19) {
                    return false;
                }
                searchView3.f1054c.getListSelection();
                return false;
            }
            searchView3.f1054c.setSelection(i10 == 21 ? 0 : searchView3.f1054c.length());
            searchView3.f1054c.setListSelection(0);
            searchView3.f1054c.clearListSelection();
            searchView3.f1054c.a();
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.m();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.i(i10);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.j(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
        boolean a(int i10);

        boolean b(int i10);
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f1094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f1095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f1096c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.f1094a = null;
            this.f1095b = null;
            this.f1096c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1094a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1095b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1096c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class p extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f1097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f1098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f1099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f1100d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f1101e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1102f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1101e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1098b = new Rect();
            this.f1100d = new Rect();
            this.f1099c = new Rect();
            a(rect, rect2);
            this.f1097a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1098b.set(rect);
            this.f1100d.set(rect);
            Rect rect3 = this.f1100d;
            int i10 = this.f1101e;
            rect3.inset(-i10, -i10);
            this.f1099c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003f  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            float width;
            int height;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1102f;
                    if (z11 && !this.f1100d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else if (action != 3) {
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f1102f;
                    this.f1102f = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f1098b.contains(x10, y10)) {
                this.f1102f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f1099c.contains(x10, y10)) {
                Rect rect = this.f1099c;
                width = x10 - rect.left;
                height = y10 - rect.top;
            } else {
                width = this.f1097a.getWidth() / 2;
                height = this.f1097a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.f1097a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f1053a0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1064m = new Rect();
        this.f1065n = new Rect();
        this.f1066o = new int[2];
        this.f1067p = new int[2];
        this.R = new b();
        this.S = new c();
        this.T = new WeakHashMap<>();
        f fVar = new f();
        this.U = fVar;
        this.V = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        this.W = new a();
        int[] iArr = d.a.f28479u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        y0 y0Var = new y0(context, typedArrayObtainStyledAttributes);
        p0.e0.p(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        LayoutInflater.from(context).inflate(y0Var.m(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1054c = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1055d = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f1056e = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f1057f = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f1058g = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1059h = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f1060i = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1061j = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f1068q = imageView5;
        p0.e0.d.q(viewFindViewById, y0Var.g(10));
        p0.e0.d.q(viewFindViewById2, y0Var.g(14));
        imageView.setImageDrawable(y0Var.g(13));
        imageView2.setImageDrawable(y0Var.g(7));
        imageView3.setImageDrawable(y0Var.g(4));
        imageView4.setImageDrawable(y0Var.g(16));
        imageView5.setImageDrawable(y0Var.g(13));
        this.f1069r = y0Var.g(12);
        b1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f1070s = y0Var.m(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f1071t = y0Var.m(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.W);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.V);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(y0Var.a(8, true));
        int iF = y0Var.f(1, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.f1074w = y0Var.o(6);
        this.G = y0Var.o(11);
        int iJ = y0Var.j(3, -1);
        if (iJ != -1) {
            setImeOptions(iJ);
        }
        int iJ2 = y0Var.j(2, -1);
        if (iJ2 != -1) {
            setInputType(iJ2);
        }
        setFocusable(y0Var.a(0, true));
        typedArrayObtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1072u = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1073v = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1062k = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        s(this.C);
        p();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1054c.setText(charSequence);
        this.f1054c.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // i.b
    public void b() {
        if (this.N) {
            return;
        }
        this.N = true;
        int imeOptions = this.f1054c.getImeOptions();
        this.O = imeOptions;
        this.f1054c.setImeOptions(imeOptions | 33554432);
        this.f1054c.setText("");
        setIconified(false);
    }

    @Override // i.b
    public void c() {
        this.f1054c.setText("");
        SearchAutoComplete searchAutoComplete = this.f1054c;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.M = "";
        clearFocus();
        s(true);
        this.f1054c.setImeOptions(this.O);
        this.N = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.I = true;
        super.clearFocus();
        this.f1054c.clearFocus();
        this.f1054c.setImeVisibility(false);
        this.I = false;
    }

    public final Intent d(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.M);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.Q;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.P.getSearchActivity());
        return intent;
    }

    public final Intent e(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.Q;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public void f() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f1054c);
            return;
        }
        o oVar = f1053a0;
        SearchAutoComplete searchAutoComplete = this.f1054c;
        Objects.requireNonNull(oVar);
        o.a();
        Method method = oVar.f1094a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        o oVar2 = f1053a0;
        SearchAutoComplete searchAutoComplete2 = this.f1054c;
        Objects.requireNonNull(oVar2);
        o.a();
        Method method2 = oVar2.f1095b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void g(int i10, String str, String str2) {
        getContext().startActivity(d("android.intent.action.SEARCH", null, null, str2, i10, null));
    }

    public int getImeOptions() {
        return this.f1054c.getImeOptions();
    }

    public int getInputType() {
        return this.f1054c.getInputType();
    }

    public int getMaxWidth() {
        return this.J;
    }

    public CharSequence getQuery() {
        return this.f1054c.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.G;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.P;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1074w : getContext().getText(this.P.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1071t;
    }

    public int getSuggestionRowLayout() {
        return this.f1070s;
    }

    public t0.a getSuggestionsAdapter() {
        return this.E;
    }

    public void h() {
        if (!TextUtils.isEmpty(this.f1054c.getText())) {
            this.f1054c.setText("");
            this.f1054c.requestFocus();
            this.f1054c.setImeVisibility(true);
        } else if (this.C) {
            l lVar = this.f1076y;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                s(true);
            }
        }
    }

    public boolean i(int i10) {
        int position;
        String strK;
        n nVar = this.A;
        if (nVar != null && nVar.b(i10)) {
            return false;
        }
        Cursor cursor = this.E.f35648e;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intentD = null;
            try {
                int i11 = s0.A;
                String strK2 = s0.k(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strK2 == null) {
                    strK2 = this.P.getSuggestIntentAction();
                }
                if (strK2 == null) {
                    strK2 = "android.intent.action.SEARCH";
                }
                String str = strK2;
                String strK3 = s0.k(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strK3 == null) {
                    strK3 = this.P.getSuggestIntentData();
                }
                if (strK3 != null && (strK = s0.k(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strK3 = strK3 + DialogConfigs.DIRECTORY_SEPERATOR + Uri.encode(strK);
                }
                intentD = d(str, strK3 == null ? null : Uri.parse(strK3), s0.k(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), s0.k(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
            } catch (RuntimeException e10) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e10);
            }
            if (intentD != null) {
                try {
                    getContext().startActivity(intentD);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intentD, e11);
                }
            }
        }
        this.f1054c.setImeVisibility(false);
        this.f1054c.dismissDropDown();
        return true;
    }

    public boolean j(int i10) {
        CharSequence charSequenceB;
        n nVar = this.A;
        if (nVar != null && nVar.a(i10)) {
            return false;
        }
        Editable text = this.f1054c.getText();
        Cursor cursor = this.E.f35648e;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i10) || (charSequenceB = this.E.b(cursor)) == null) {
            setQuery(text);
            return true;
        }
        setQuery(charSequenceB);
        return true;
    }

    public void k(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void l() {
        s(false);
        this.f1054c.requestFocus();
        this.f1054c.setImeVisibility(true);
        View.OnClickListener onClickListener = this.B;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void m() {
        Editable text = this.f1054c.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f1075x;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.P != null) {
                g(0, null, text.toString());
            }
            this.f1054c.setImeVisibility(false);
            this.f1054c.dismissDropDown();
        }
    }

    public final void n() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1054c.getText());
        if (!z11 && (!this.C || this.N)) {
            z10 = false;
        }
        this.f1060i.setVisibility(z10 ? 0 : 8);
        Drawable drawable = this.f1060i.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void o() {
        int[] iArr = this.f1054c.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1056e.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1057f.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.R);
        post(this.S);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.f1054c;
            Rect rect = this.f1064m;
            searchAutoComplete.getLocationInWindow(this.f1066o);
            getLocationInWindow(this.f1067p);
            int[] iArr = this.f1066o;
            int i14 = iArr[1];
            int[] iArr2 = this.f1067p;
            int i15 = i14 - iArr2[1];
            int i16 = iArr[0] - iArr2[0];
            rect.set(i16, i15, searchAutoComplete.getWidth() + i16, searchAutoComplete.getHeight() + i15);
            Rect rect2 = this.f1065n;
            Rect rect3 = this.f1064m;
            rect2.set(rect3.left, 0, rect3.right, i13 - i11);
            p pVar = this.f1063l;
            if (pVar != null) {
                pVar.a(this.f1065n, this.f1064m);
                return;
            }
            p pVar2 = new p(this.f1065n, this.f1064m, this.f1054c);
            this.f1063l = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i10, int i11) {
        int preferredWidth;
        int mode;
        int size;
        if (this.D) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = this.J;
                if (size2 <= 0) {
                    size2 = getPreferredWidth();
                }
            } else if (mode2 == 1073741824 && (preferredWidth = this.J) > 0) {
            }
            mode = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode != Integer.MIN_VALUE) {
                size = Math.min(getPreferredHeight(), size);
            } else if (mode == 0) {
                size = getPreferredHeight();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        }
        preferredWidth = this.J;
        if (preferredWidth <= 0) {
            preferredWidth = getPreferredWidth();
        }
        size2 = Math.min(preferredWidth, size2);
        mode = View.MeasureSpec.getMode(i11);
        size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            size = Math.min(getPreferredHeight(), size);
        } else if (mode == 0) {
            size = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        s(savedState.f1078c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1078c = this.D;
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.R);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void p() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1054c;
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        CharSequence charSequence2 = charSequence;
        if (this.C && this.f1069r != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.f1069r.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f1069r), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void q() {
        int i10 = 0;
        if (!((this.F || this.K) && !this.D) || (this.f1059h.getVisibility() != 0 && this.f1061j.getVisibility() != 0)) {
            i10 = 8;
        }
        this.f1057f.setVisibility(i10);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0021  */
    public final void r(boolean z10) {
        boolean z11 = this.F;
        int i10 = 0;
        if (z11) {
            if (!((z11 || this.K) && !this.D) || !hasFocus() || (!z10 && this.K)) {
                i10 = 8;
            }
        } else {
            i10 = 8;
        }
        this.f1059h.setVisibility(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.I || !isFocusable()) {
            return false;
        }
        if (this.D) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f1054c.requestFocus(i10, rect);
        if (zRequestFocus) {
            s(false);
        }
        return zRequestFocus;
    }

    public final void s(boolean z10) {
        this.D = z10;
        int i10 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f1054c.getText());
        this.f1058g.setVisibility(i10);
        r(z11);
        this.f1055d.setVisibility(z10 ? 8 : 0);
        this.f1068q.setVisibility((this.f1068q.getDrawable() == null || this.C) ? 8 : 0);
        n();
        t(!z11);
        q();
    }

    public void setAppSearchData(Bundle bundle) {
        this.Q = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            h();
        } else {
            l();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.C == z10) {
            return;
        }
        this.C = z10;
        s(z10);
        p();
    }

    public void setImeOptions(int i10) {
        this.f1054c.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1054c.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.J = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f1076y = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1077z = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f1075x = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.B = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.A = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.G = charSequence;
        p();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.H = z10;
        t0.a aVar = this.E;
        if (aVar instanceof s0) {
            ((s0) aVar).f1343s = z10 ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z10;
        this.P = searchableInfo;
        Intent intent = null;
        if (searchableInfo != null) {
            this.f1054c.setThreshold(searchableInfo.getSuggestThreshold());
            this.f1054c.setImeOptions(this.P.getImeOptions());
            int inputType = this.P.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.P.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            this.f1054c.setInputType(inputType);
            t0.a aVar = this.E;
            if (aVar != null) {
                aVar.a(null);
            }
            if (this.P.getSuggestAuthority() != null) {
                s0 s0Var = new s0(getContext(), this, this.P, this.T);
                this.E = s0Var;
                this.f1054c.setAdapter(s0Var);
                ((s0) this.E).f1343s = this.H ? 2 : 1;
            }
            p();
        }
        SearchableInfo searchableInfo2 = this.P;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.P.getVoiceSearchLaunchWebSearch()) {
                intent = this.f1072u;
            } else if (this.P.getVoiceSearchLaunchRecognizer()) {
                intent = this.f1073v;
            }
            z10 = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.K = z10;
        if (z10) {
            this.f1054c.setPrivateImeOptions("nm");
        }
        s(this.D);
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.F = z10;
        s(this.D);
    }

    public void setSuggestionsAdapter(t0.a aVar) {
        this.E = aVar;
        this.f1054c.setAdapter(aVar);
    }

    public final void t(boolean z10) {
        int i10 = 8;
        if (this.K && !this.D && z10) {
            this.f1059h.setVisibility(8);
            i10 = 0;
        }
        this.f1061j.setVisibility(i10);
    }
}
