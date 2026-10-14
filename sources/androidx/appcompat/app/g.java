package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class g extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AlertController f670c;

    public static class a {
        private final AlertController.b P;
        private final int mTheme;

        public a(Context context) {
            this(context, g.b(context, 0));
        }

        public a(Context context, int i10) {
            this.P = new AlertController.b(new ContextThemeWrapper(context, g.b(context, i10)));
            this.mTheme = i10;
        }

        /* JADX WARN: Code duplicated, block: B:70:0x0117  */
        /* JADX WARN: Code duplicated, block: B:73:0x011e  */
        /* JADX WARN: Code duplicated, block: B:74:0x0122  */
        /* JADX WARN: Code duplicated, block: B:76:0x0126  */
        public g create() {
            ListAdapter dVar;
            AdapterView.OnItemClickListener fVar;
            AdapterView.OnItemSelectedListener onItemSelectedListener;
            g gVar = new g(this.P.f562a, this.mTheme);
            AlertController.b bVar = this.P;
            AlertController alertController = gVar.f670c;
            View view = bVar.f567f;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar.f566e;
                if (charSequence != null) {
                    alertController.f537e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f565d;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
                int i10 = bVar.f564c;
                if (i10 != 0) {
                    alertController.e(i10);
                }
            }
            CharSequence charSequence2 = bVar.f568g;
            if (charSequence2 != null) {
                alertController.f538f = charSequence2;
                TextView textView2 = alertController.F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.f569h;
            if (charSequence3 != null || bVar.f570i != null) {
                alertController.d(-1, charSequence3, bVar.f571j, null, bVar.f570i);
            }
            CharSequence charSequence4 = bVar.f572k;
            if (charSequence4 != null || bVar.f573l != null) {
                alertController.d(-2, charSequence4, bVar.f574m, null, bVar.f573l);
            }
            CharSequence charSequence5 = bVar.f575n;
            if (charSequence5 != null || bVar.f576o != null) {
                alertController.d(-3, charSequence5, bVar.f577p, null, bVar.f576o);
            }
            if (bVar.f582u != null || bVar.J != null || bVar.f583v != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f563b.inflate(alertController.L, (ViewGroup) null);
                if (bVar.F) {
                    dVar = bVar.J == null ? new c(bVar, bVar.f562a, alertController.M, R.id.text1, bVar.f582u, recycleListView) : new d(bVar, bVar.f562a, bVar.J, false, recycleListView, alertController);
                } else {
                    int i11 = bVar.G ? alertController.N : alertController.O;
                    if (bVar.J != null) {
                        dVar = new SimpleCursorAdapter(bVar.f562a, i11, bVar.J, new String[]{bVar.K}, new int[]{R.id.text1});
                    } else {
                        dVar = bVar.f583v;
                        if (dVar == null) {
                            dVar = new AlertController.d(bVar.f562a, i11, R.id.text1, bVar.f582u);
                        }
                    }
                }
                alertController.H = dVar;
                alertController.I = bVar.H;
                if (bVar.f584w != null) {
                    fVar = new e(bVar, alertController);
                } else {
                    if (bVar.I != null) {
                        fVar = new f(bVar, recycleListView, alertController);
                    }
                    onItemSelectedListener = bVar.M;
                    if (onItemSelectedListener != null) {
                        recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                    }
                    if (bVar.G) {
                        recycleListView.setChoiceMode(1);
                    } else if (bVar.F) {
                        recycleListView.setChoiceMode(2);
                    }
                    alertController.f539g = recycleListView;
                }
                recycleListView.setOnItemClickListener(fVar);
                onItemSelectedListener = bVar.M;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (bVar.G) {
                    recycleListView.setChoiceMode(1);
                } else if (bVar.F) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f539g = recycleListView;
            }
            View view2 = bVar.f586y;
            if (view2 == null) {
                int i12 = bVar.f585x;
                if (i12 != 0) {
                    alertController.f540h = null;
                    alertController.f541i = i12;
                    alertController.f546n = false;
                }
            } else if (bVar.D) {
                int i13 = bVar.f587z;
                int i14 = bVar.A;
                int i15 = bVar.B;
                int i16 = bVar.C;
                alertController.f540h = view2;
                alertController.f541i = 0;
                alertController.f546n = true;
                alertController.f542j = i13;
                alertController.f543k = i14;
                alertController.f544l = i15;
                alertController.f545m = i16;
            } else {
                alertController.f540h = view2;
                alertController.f541i = 0;
                alertController.f546n = false;
            }
            gVar.setCancelable(this.P.f578q);
            if (this.P.f578q) {
                gVar.setCanceledOnTouchOutside(true);
            }
            gVar.setOnCancelListener(this.P.f579r);
            gVar.setOnDismissListener(this.P.f580s);
            DialogInterface.OnKeyListener onKeyListener = this.P.f581t;
            if (onKeyListener != null) {
                gVar.setOnKeyListener(onKeyListener);
            }
            return gVar;
        }

        public Context getContext() {
            return this.P.f562a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f583v = listAdapter;
            bVar.f584w = onClickListener;
            return this;
        }

        public a setCancelable(boolean z10) {
            this.P.f578q = z10;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.b bVar = this.P;
            bVar.J = cursor;
            bVar.K = str;
            bVar.f584w = onClickListener;
            return this;
        }

        public a setCustomTitle(View view) {
            this.P.f567f = view;
            return this;
        }

        public a setIcon(int i10) {
            this.P.f564c = i10;
            return this;
        }

        public a setIcon(Drawable drawable) {
            this.P.f565d = drawable;
            return this;
        }

        public a setIconAttribute(int i10) {
            TypedValue typedValue = new TypedValue();
            this.P.f562a.getTheme().resolveAttribute(i10, typedValue, true);
            this.P.f564c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z10) {
            Objects.requireNonNull(this.P);
            return this;
        }

        public a setItems(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f582u = bVar.f562a.getResources().getTextArray(i10);
            this.P.f584w = onClickListener;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f582u = charSequenceArr;
            bVar.f584w = onClickListener;
            return this;
        }

        public a setMessage(int i10) {
            AlertController.b bVar = this.P;
            bVar.f568g = bVar.f562a.getText(i10);
            return this;
        }

        public a setMessage(CharSequence charSequence) {
            this.P.f568g = charSequence;
            return this;
        }

        public a setMultiChoiceItems(int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.f582u = bVar.f562a.getResources().getTextArray(i10);
            AlertController.b bVar2 = this.P;
            bVar2.I = onMultiChoiceClickListener;
            bVar2.E = zArr;
            bVar2.F = true;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.J = cursor;
            bVar.I = onMultiChoiceClickListener;
            bVar.L = str;
            bVar.K = str2;
            bVar.F = true;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.f582u = charSequenceArr;
            bVar.I = onMultiChoiceClickListener;
            bVar.E = zArr;
            bVar.F = true;
            return this;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f572k = bVar.f562a.getText(i10);
            this.P.f574m = onClickListener;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f572k = charSequence;
            bVar.f574m = onClickListener;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.P.f573l = drawable;
            return this;
        }

        public a setNeutralButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f575n = bVar.f562a.getText(i10);
            this.P.f577p = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f575n = charSequence;
            bVar.f577p = onClickListener;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.P.f576o = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.f579r = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.f580s = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.M = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.f581t = onKeyListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f569h = bVar.f562a.getText(i10);
            this.P.f571j = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f569h = charSequence;
            bVar.f571j = onClickListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.P.f570i = drawable;
            return this;
        }

        public a setRecycleOnMeasureEnabled(boolean z10) {
            Objects.requireNonNull(this.P);
            return this;
        }

        public a setSingleChoiceItems(int i10, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f582u = bVar.f562a.getResources().getTextArray(i10);
            AlertController.b bVar2 = this.P;
            bVar2.f584w = onClickListener;
            bVar2.H = i11;
            bVar2.G = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.J = cursor;
            bVar.f584w = onClickListener;
            bVar.H = i10;
            bVar.K = str;
            bVar.G = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f583v = listAdapter;
            bVar.f584w = onClickListener;
            bVar.H = i10;
            bVar.G = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.f582u = charSequenceArr;
            bVar.f584w = onClickListener;
            bVar.H = i10;
            bVar.G = true;
            return this;
        }

        public a setTitle(int i10) {
            AlertController.b bVar = this.P;
            bVar.f566e = bVar.f562a.getText(i10);
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.P.f566e = charSequence;
            return this;
        }

        public a setView(int i10) {
            AlertController.b bVar = this.P;
            bVar.f586y = null;
            bVar.f585x = i10;
            bVar.D = false;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.P;
            bVar.f586y = view;
            bVar.f585x = 0;
            bVar.D = false;
            return this;
        }

        @Deprecated
        public a setView(View view, int i10, int i11, int i12, int i13) {
            AlertController.b bVar = this.P;
            bVar.f586y = view;
            bVar.f585x = 0;
            bVar.D = true;
            bVar.f587z = i10;
            bVar.A = i11;
            bVar.B = i12;
            bVar.C = i13;
            return this;
        }

        public g show() {
            g gVarCreate = create();
            gVarCreate.show();
            return gVarCreate;
        }
    }

    public g(Context context, int i10) {
        super(context, b(context, i10));
        this.f670c = new AlertController(getContext(), this, getWindow());
    }

    public static int b(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.inscode.autoclicker.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.o, androidx.activity.e, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i10;
        View view;
        ListAdapter listAdapter;
        View viewFindViewById;
        Button button;
        super.onCreate(bundle);
        AlertController alertController = this.f670c;
        int i11 = alertController.K;
        alertController.f534b.setContentView(alertController.J);
        View viewFindViewById2 = alertController.f535c.findViewById(com.inscode.autoclicker.R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(com.inscode.autoclicker.R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(com.inscode.autoclicker.R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(com.inscode.autoclicker.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(com.inscode.autoclicker.R.id.customPanel);
        View viewInflate = alertController.f540h;
        if (viewInflate == null) {
            viewInflate = alertController.f541i != 0 ? LayoutInflater.from(alertController.f533a).inflate(alertController.f541i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !AlertController.a(viewInflate)) {
            alertController.f535c.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) alertController.f535c.findViewById(com.inscode.autoclicker.R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f546n) {
                frameLayout.setPadding(alertController.f542j, alertController.f543k, alertController.f544l, alertController.f545m);
            }
            if (alertController.f539g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(com.inscode.autoclicker.R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(com.inscode.autoclicker.R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(com.inscode.autoclicker.R.id.buttonPanel);
        ViewGroup viewGroupC = alertController.c(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupC2 = alertController.c(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupC3 = alertController.c(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f535c.findViewById(com.inscode.autoclicker.R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupC2.findViewById(R.id.message);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f538f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.f539g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f539g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupC2.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) viewGroupC3.findViewById(R.id.button1);
        alertController.f547o = button2;
        button2.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.f548p) && alertController.f550r == null) {
            alertController.f547o.setVisibility(8);
            i10 = 0;
        } else {
            alertController.f547o.setText(alertController.f548p);
            Drawable drawable = alertController.f550r;
            if (drawable != null) {
                int i12 = alertController.f536d;
                drawable.setBounds(0, 0, i12, i12);
                alertController.f547o.setCompoundDrawables(alertController.f550r, null, null, null);
            }
            alertController.f547o.setVisibility(0);
            i10 = 1;
        }
        Button button3 = (Button) viewGroupC3.findViewById(R.id.button2);
        alertController.f551s = button3;
        button3.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.f552t) && alertController.f554v == null) {
            alertController.f551s.setVisibility(8);
        } else {
            alertController.f551s.setText(alertController.f552t);
            Drawable drawable2 = alertController.f554v;
            if (drawable2 != null) {
                int i13 = alertController.f536d;
                drawable2.setBounds(0, 0, i13, i13);
                alertController.f551s.setCompoundDrawables(alertController.f554v, null, null, null);
            }
            alertController.f551s.setVisibility(0);
            i10 |= 2;
        }
        Button button4 = (Button) viewGroupC3.findViewById(R.id.button3);
        alertController.f555w = button4;
        button4.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.f556x) && alertController.f558z == null) {
            alertController.f555w.setVisibility(8);
            view = null;
        } else {
            alertController.f555w.setText(alertController.f556x);
            Drawable drawable3 = alertController.f558z;
            if (drawable3 != null) {
                int i14 = alertController.f536d;
                drawable3.setBounds(0, 0, i14, i14);
                view = null;
                alertController.f555w.setCompoundDrawables(alertController.f558z, null, null, null);
            } else {
                view = null;
            }
            alertController.f555w.setVisibility(0);
            i10 |= 4;
        }
        Context context = alertController.f533a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.inscode.autoclicker.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                button = alertController.f547o;
            } else if (i10 == 2) {
                button = alertController.f551s;
            } else if (i10 == 4) {
                button = alertController.f555w;
            }
            alertController.b(button);
        }
        if (!(i10 != 0)) {
            viewGroupC3.setVisibility(8);
        }
        if (alertController.G != null) {
            viewGroupC.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f535c.findViewById(com.inscode.autoclicker.R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) alertController.f535c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(alertController.f537e)) && alertController.P) {
                TextView textView2 = (TextView) alertController.f535c.findViewById(com.inscode.autoclicker.R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.f537e);
                int i15 = alertController.B;
                if (i15 != 0) {
                    alertController.D.setImageResource(i15);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            } else {
                alertController.f535c.findViewById(com.inscode.autoclicker.R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                viewGroupC.setVisibility(8);
            }
        }
        boolean z11 = viewGroup.getVisibility() != 8;
        int i16 = (viewGroupC == null || viewGroupC.getVisibility() == 8) ? 0 : 1;
        boolean z12 = viewGroupC3.getVisibility() != 8;
        if (!z12 && (viewFindViewById = viewGroupC2.findViewById(com.inscode.autoclicker.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i16 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.f538f == null && alertController.f539g == null) ? view : viewGroupC.findViewById(com.inscode.autoclicker.R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupC2.findViewById(com.inscode.autoclicker.R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.f539g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z12 || i16 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i16 != 0 ? recycleListView.getPaddingTop() : recycleListView.f559c, recycleListView.getPaddingRight(), z12 ? recycleListView.getPaddingBottom() : recycleListView.f560d);
            }
        }
        if (!z11) {
            View view2 = alertController.f539g;
            if (view2 == null) {
                view2 = alertController.A;
            }
            if (view2 != null) {
                int i17 = z12 ? 2 : 0;
                View viewFindViewById11 = alertController.f535c.findViewById(com.inscode.autoclicker.R.id.scrollIndicatorUp);
                View viewFindViewById12 = alertController.f535c.findViewById(com.inscode.autoclicker.R.id.scrollIndicatorDown);
                WeakHashMap<View, m0> weakHashMap = e0.f34354a;
                e0.j.d(view2, i16 | i17, 3);
                if (viewFindViewById11 != null) {
                    viewGroupC2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupC2.removeView(viewFindViewById12);
                }
            }
        }
        ListView listView2 = alertController.f539g;
        if (listView2 == null || (listAdapter = alertController.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i18 = alertController.I;
        if (i18 > -1) {
            listView2.setItemChecked(i18, true);
            listView2.setSelection(i18);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f670c.A;
        if (nestedScrollView != null && nestedScrollView.h(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f670c.A;
        if (nestedScrollView != null && nestedScrollView.h(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.o, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f670c;
        alertController.f537e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
