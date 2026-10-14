package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SuppressLint({"ResourceType"})
    public static final int[] f1015k = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.widget.e f1016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f1017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f0 f1018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SpinnerAdapter f1019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i f1021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f1023j;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1024c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1024c = parcel.readByte() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1024c ? (byte) 1 : (byte) 0);
        }
    }

    public class a extends f0 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f1025l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, h hVar) {
            super(view);
            this.f1025l = hVar;
        }

        @Override // androidx.appcompat.widget.f0
        public j.f b() {
            return this.f1025l;
        }

        @Override // androidx.appcompat.widget.f0
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().a()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().a()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    public static final class c {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static final class d {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        public static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    public static final class e {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (o0.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public class f implements i, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.appcompat.app.g f1028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ListAdapter f1029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f1030e;

        public f() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public boolean a() {
            androidx.appcompat.app.g gVar = this.f1028c;
            if (gVar != null) {
                return gVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public Drawable b() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void dismiss() {
            androidx.appcompat.app.g gVar = this.f1028c;
            if (gVar != null) {
                gVar.dismiss();
                this.f1028c = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public CharSequence f() {
            return this.f1030e;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void i(CharSequence charSequence) {
            this.f1030e = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void l(int i10, int i11) {
            if (this.f1029d == null) {
                return;
            }
            androidx.appcompat.app.g.a aVar = new androidx.appcompat.app.g.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f1030e;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.g gVarCreate = aVar.setSingleChoiceItems(this.f1029d, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f1028c = gVarCreate;
            ListView listView = gVarCreate.f670c.f539g;
            d.d(listView, i10);
            d.c(listView, i11);
            this.f1028c.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public int m() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void n(ListAdapter listAdapter) {
            this.f1029d = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i10, this.f1029d.getItemId(i10));
            }
            androidx.appcompat.app.g gVar = this.f1028c;
            if (gVar != null) {
                gVar.dismiss();
                this.f1028c = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    public static class g implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SpinnerAdapter f1032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ListAdapter f1033d;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1032c = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1033d = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof u0) {
                    u0 u0Var = (u0) spinnerAdapter;
                    if (u0Var.getDropDownViewTheme() == null) {
                        u0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1033d;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1032c;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1032c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1032c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1032c;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1032c;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1032c;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1033d;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1032c;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1032c;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class h extends h0 implements i {
        public CharSequence D;
        public ListAdapter E;
        public final Rect F;
        public int G;

        public class a implements AdapterView.OnItemClickListener {
            public a(AppCompatSpinner appCompatSpinner) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    AppCompatSpinner.this.performItemClick(view, i10, hVar.E.getItemId(i10));
                }
                h.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                Objects.requireNonNull(hVar);
                WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
                if (!(p0.e0.g.b(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(hVar.F))) {
                    h.this.dismiss();
                } else {
                    h.this.r();
                    h.this.show();
                }
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1036c;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1036c = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1036c);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.F = new Rect();
            this.f1247q = AppCompatSpinner.this;
            q(true);
            this.f1248r = new a(AppCompatSpinner.this);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public CharSequence f() {
            return this.D;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void i(CharSequence charSequence) {
            this.D = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void k(int i10) {
            this.G = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public void l(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            r();
            this.A.setInputMethodMode(2);
            show();
            d0 d0Var = this.f1235e;
            d0Var.setChoiceMode(1);
            d.d(d0Var, i10);
            d.c(d0Var, i11);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            d0 d0Var2 = this.f1235e;
            if (a() && d0Var2 != null) {
                d0Var2.setListSelectionHidden(false);
                d0Var2.setSelection(selectedItemPosition);
                if (d0Var2.getChoiceMode() != 0) {
                    d0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zA || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.A.setOnDismissListener(new c(bVar));
        }

        @Override // androidx.appcompat.widget.h0, androidx.appcompat.widget.AppCompatSpinner.i
        public void n(ListAdapter listAdapter) {
            super.n(listAdapter);
            this.E = listAdapter;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x008d  */
        /* JADX WARN: Code duplicated, block: B:24:0x0096  */
        public void r() {
            int iMax;
            int i10;
            Drawable drawableB = b();
            int i11 = 0;
            if (drawableB != null) {
                drawableB.getPadding(AppCompatSpinner.this.f1023j);
                i11 = g1.b(AppCompatSpinner.this) ? AppCompatSpinner.this.f1023j.right : -AppCompatSpinner.this.f1023j.left;
            } else {
                Rect rect = AppCompatSpinner.this.f1023j;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i12 = appCompatSpinner.f1022i;
            if (i12 != -2) {
                if (i12 == -1) {
                    iMax = (width - paddingLeft) - paddingRight;
                } else {
                    p(i12);
                }
                if (g1.b(AppCompatSpinner.this)) {
                    i10 = (((width - paddingRight) - this.f1237g) - this.G) + i11;
                } else {
                    i10 = paddingLeft + this.G + i11;
                }
                this.f1238h = i10;
            }
            int iA = appCompatSpinner.a((SpinnerAdapter) this.E, b());
            int i13 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = AppCompatSpinner.this.f1023j;
            int i14 = (i13 - rect2.left) - rect2.right;
            if (iA > i14) {
                iA = i14;
            }
            iMax = Math.max(iA, (width - paddingLeft) - paddingRight);
            p(iMax);
            if (g1.b(AppCompatSpinner.this)) {
                i10 = (((width - paddingRight) - this.f1237g) - this.G) + i11;
            } else {
                i10 = paddingLeft + this.G + i11;
            }
            this.f1238h = i10;
        }
    }

    public interface i {
        boolean a();

        Drawable b();

        int c();

        void dismiss();

        void e(int i10);

        CharSequence f();

        void i(CharSequence charSequence);

        void j(int i10);

        void k(int i10);

        void l(int i10, int i11);

        int m();

        void n(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSpinner(Context context, int i10) {
        this(context, null, com.inscode.autoclicker.R.attr.spinnerStyle, i10);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.inscode.autoclicker.R.attr.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048 A[Catch: Exception -> 0x0050, all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:13:0x0042, B:15:0x0048, B:23:0x0056), top: B:45:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View, android.widget.Spinner, androidx.appcompat.widget.AppCompatSpinner] */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11, Resources.Theme theme) throws Throwable {
        i.c cVar;
        ?? r12;
        ?? r10;
        TypedArray typedArrayObtainStyledAttributes;
        boolean zHasValue;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i10);
        this.f1023j = new Rect();
        t0.a(this, getContext());
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d.a.f28480v, i10, 0);
        this.f1016c = new androidx.appcompat.widget.e(this);
        try {
            if (theme == null) {
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
                if (resourceId != 0) {
                    cVar = new i.c(context, resourceId);
                } else {
                    this.f1017d = context;
                }
                r12 = -1;
                r10 = 0;
                if (i11 == -1) {
                    try {
                        typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1015k, i10, 0);
                        try {
                            zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                            r12 = typedArrayObtainStyledAttributes;
                            if (zHasValue) {
                                i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
                                r12 = typedArrayObtainStyledAttributes;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                            r12 = typedArrayObtainStyledAttributes;
                            if (typedArrayObtainStyledAttributes != null) {
                            }
                            if (i11 == 0) {
                                f fVar = new f();
                                this.f1021h = fVar;
                                fVar.i(typedArrayObtainStyledAttributes2.getString(2));
                            } else if (i11 == 1) {
                                h hVar = new h(this.f1017d, attributeSet, i10);
                                y0 y0VarR = y0.r(this.f1017d, attributeSet, d.a.f28480v, i10, 0);
                                this.f1022i = y0VarR.l(3, -2);
                                hVar.A.setBackgroundDrawable(y0VarR.g(1));
                                hVar.D = typedArrayObtainStyledAttributes2.getString(2);
                                y0VarR.f1412b.recycle();
                                this.f1021h = hVar;
                                this.f1018e = new a(this, hVar);
                            }
                            textArray = typedArrayObtainStyledAttributes2.getTextArray(0);
                            if (textArray != null) {
                                ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                                arrayAdapter.setDropDownViewResource(com.inscode.autoclicker.R.layout.support_simple_spinner_dropdown_item);
                                setAdapter(arrayAdapter);
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            this.f1020g = true;
                            spinnerAdapter = this.f1019f;
                            if (spinnerAdapter != null) {
                                setAdapter(spinnerAdapter);
                                this.f1019f = null;
                            }
                            this.f1016c.d(attributeSet, i10);
                            return;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        typedArrayObtainStyledAttributes = null;
                    } catch (Throwable th) {
                        th = th;
                        if (r10 != 0) {
                            r10.recycle();
                        }
                        throw th;
                    }
                    r12.recycle();
                }
                if (i11 == 0) {
                    f fVar2 = new f();
                    this.f1021h = fVar2;
                    fVar2.i(typedArrayObtainStyledAttributes2.getString(2));
                } else if (i11 == 1) {
                    h hVar2 = new h(this.f1017d, attributeSet, i10);
                    y0 y0VarR2 = y0.r(this.f1017d, attributeSet, d.a.f28480v, i10, 0);
                    this.f1022i = y0VarR2.l(3, -2);
                    hVar2.A.setBackgroundDrawable(y0VarR2.g(1));
                    hVar2.D = typedArrayObtainStyledAttributes2.getString(2);
                    y0VarR2.f1412b.recycle();
                    this.f1021h = hVar2;
                    this.f1018e = new a(this, hVar2);
                }
                textArray = typedArrayObtainStyledAttributes2.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter2.setDropDownViewResource(com.inscode.autoclicker.R.layout.support_simple_spinner_dropdown_item);
                    setAdapter(arrayAdapter2);
                }
                typedArrayObtainStyledAttributes2.recycle();
                this.f1020g = true;
                spinnerAdapter = this.f1019f;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f1019f = null;
                }
                this.f1016c.d(attributeSet, i10);
                return;
            }
            cVar = new i.c(context, theme);
            if (i11 == -1) {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1015k, i10, 0);
                zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                r12 = typedArrayObtainStyledAttributes;
                if (zHasValue) {
                    i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    r12 = typedArrayObtainStyledAttributes;
                }
                r12.recycle();
            }
            if (i11 == 0) {
                f fVar3 = new f();
                this.f1021h = fVar3;
                fVar3.i(typedArrayObtainStyledAttributes2.getString(2));
            } else if (i11 == 1) {
                h hVar3 = new h(this.f1017d, attributeSet, i10);
                y0 y0VarR3 = y0.r(this.f1017d, attributeSet, d.a.f28480v, i10, 0);
                this.f1022i = y0VarR3.l(3, -2);
                hVar3.A.setBackgroundDrawable(y0VarR3.g(1));
                hVar3.D = typedArrayObtainStyledAttributes2.getString(2);
                y0VarR3.f1412b.recycle();
                this.f1021h = hVar3;
                this.f1018e = new a(this, hVar3);
            }
            textArray = typedArrayObtainStyledAttributes2.getTextArray(0);
            if (textArray != null) {
                ArrayAdapter arrayAdapter3 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                arrayAdapter3.setDropDownViewResource(com.inscode.autoclicker.R.layout.support_simple_spinner_dropdown_item);
                setAdapter(arrayAdapter3);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f1020g = true;
            spinnerAdapter = this.f1019f;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f1019f = null;
            }
            this.f1016c.d(attributeSet, i10);
            return;
        } catch (Throwable th2) {
            th = th2;
            r10 = r12;
        }
        this.f1017d = cVar;
        r12 = -1;
        r10 = 0;
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f1023j);
        Rect rect = this.f1023j;
        return iMax2 + rect.left + rect.right;
    }

    public void b() {
        this.f1021h.l(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1016c;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i iVar = this.f1021h;
        return iVar != null ? iVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i iVar = this.f1021h;
        return iVar != null ? iVar.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1021h != null ? this.f1022i : super.getDropDownWidth();
    }

    public final i getInternalPopup() {
        return this.f1021h;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i iVar = this.f1021h;
        return iVar != null ? iVar.b() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1017d;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i iVar = this.f1021h;
        return iVar != null ? iVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1016c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1016c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f1021h;
        if (iVar == null || !iVar.a()) {
            return;
        }
        this.f1021h.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1021h == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f1024c || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        i iVar = this.f1021h;
        savedState.f1024c = iVar != null && iVar.a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.f1018e;
        if (f0Var == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        i iVar = this.f1021h;
        if (iVar == null) {
            return super.performClick();
        }
        if (iVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1020g) {
            this.f1019f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1021h != null) {
            Context context = this.f1017d;
            if (context == null) {
                context = getContext();
            }
            this.f1021h.n(new g(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1016c;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.e eVar = this.f1016c;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        i iVar = this.f1021h;
        if (iVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            iVar.k(i10);
            this.f1021h.e(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        i iVar = this.f1021h;
        if (iVar != null) {
            iVar.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1021h != null) {
            this.f1022i = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.f1021h;
        if (iVar != null) {
            iVar.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(e.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.f1021h;
        if (iVar != null) {
            iVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1016c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1016c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}
