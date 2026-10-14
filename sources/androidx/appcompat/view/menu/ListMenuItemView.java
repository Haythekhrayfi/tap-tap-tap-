package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.y0;
import com.inscode.autoclicker.R;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RadioButton f781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CheckBox f783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f787k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f789m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f790n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f791o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f792p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f793q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LayoutInflater f794r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f795s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        y0 y0VarR = y0.r(getContext(), attributeSet, d.a.f28476r, i10, 0);
        this.f788l = y0VarR.g(5);
        this.f789m = y0VarR.m(1, -1);
        this.f791o = y0VarR.a(7, false);
        this.f790n = context;
        this.f792p = y0VarR.g(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f793q = typedArrayObtainStyledAttributes.hasValue(0);
        y0VarR.f1412b.recycle();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f794r == null) {
            this.f794r = LayoutInflater.from(getContext());
        }
        return this.f794r;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f785i;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f783g = checkBox;
        LinearLayout linearLayout = this.f787k;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f786j;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f786j.getLayoutParams();
        rect.top = this.f786j.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f781e = radioButton;
        LinearLayout linearLayout = this.f787k;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f779c;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void initialize(g gVar, int i10) {
        int i11;
        String string;
        this.f779c = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.f861e);
        setCheckable(gVar.isCheckable());
        boolean zN = gVar.n();
        gVar.e();
        int i12 = (zN && this.f779c.n()) ? 0 : 8;
        if (i12 == 0) {
            TextView textView = this.f784h;
            g gVar2 = this.f779c;
            char cE = gVar2.e();
            if (cE == 0) {
                string = "";
            } else {
                Resources resources = gVar2.f870n.getContext().getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(gVar2.f870n.getContext()).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i13 = gVar2.f870n.isQwertyMode() ? gVar2.f867k : gVar2.f865i;
                g.c(sb2, i13, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                g.c(sb2, i13, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                g.c(sb2, i13, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                g.c(sb2, i13, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                g.c(sb2, i13, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                g.c(sb2, i13, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (cE == '\b') {
                    i11 = R.string.abc_menu_delete_shortcut_label;
                } else if (cE != '\n') {
                    if (cE != ' ') {
                        sb2.append(cE);
                    } else {
                        i11 = R.string.abc_menu_space_shortcut_label;
                    }
                    string = sb2.toString();
                } else {
                    i11 = R.string.abc_menu_enter_shortcut_label;
                }
                sb2.append(resources.getString(i11));
                string = sb2.toString();
            }
            textView.setText(string);
        }
        if (this.f784h.getVisibility() != i12) {
            this.f784h.setVisibility(i12);
        }
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.f873q);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f788l;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.q(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f782f = textView;
        int i10 = this.f789m;
        if (i10 != -1) {
            textView.setTextAppearance(this.f790n, i10);
        }
        this.f784h = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f785i = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f792p);
        }
        this.f786j = (ImageView) findViewById(R.id.group_divider);
        this.f787k = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f780d != null && this.f791o) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f780d.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z10 && this.f781e == null && this.f783g == null) {
            return;
        }
        if (this.f779c.h()) {
            if (this.f781e == null) {
                b();
            }
            compoundButton = this.f781e;
            compoundButton2 = this.f783g;
        } else {
            if (this.f783g == null) {
                a();
            }
            compoundButton = this.f783g;
            compoundButton2 = this.f781e;
        }
        if (z10) {
            compoundButton.setChecked(this.f779c.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f783g;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f781e;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f779c.h()) {
            if (this.f781e == null) {
                b();
            }
            compoundButton = this.f781e;
        } else {
            if (this.f783g == null) {
                a();
            }
            compoundButton = this.f783g;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f795s = z10;
        this.f791o = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f786j;
        if (imageView != null) {
            imageView.setVisibility((this.f793q || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f779c.f870n.getOptionalIconsVisible() || this.f795s;
        if (z10 || this.f791o) {
            ImageView imageView = this.f780d;
            if (imageView == null && drawable == null && !this.f791o) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f780d = imageView2;
                LinearLayout linearLayout = this.f787k;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f791o) {
                this.f780d.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f780d;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f780d.getVisibility() != 0) {
                this.f780d.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i10;
        TextView textView;
        if (charSequence != null) {
            this.f782f.setText(charSequence);
            if (this.f782f.getVisibility() == 0) {
                return;
            }
            textView = this.f782f;
            i10 = 0;
        } else {
            i10 = 8;
            if (this.f782f.getVisibility() == 8) {
                return;
            } else {
                textView = this.f782f;
            }
        }
        textView.setVisibility(i10);
    }
}
