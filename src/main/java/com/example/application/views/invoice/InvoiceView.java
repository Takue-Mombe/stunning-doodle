package com.example.application.views.invoice;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.RolesAllowed;
import java.util.ArrayList;
import java.util.List;

@PageTitle("Invoice")
@Route(value = "my-view4", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class InvoiceView extends Composite<VerticalLayout> {

    public InvoiceView() {
        Paragraph textLarge = new Paragraph();
        FormLayout formLayout2Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        H3 h3 = new H3();
        Hr hr = new Hr();
        FormLayout formLayout2Col2 = new FormLayout();
        ComboBox comboBox = new ComboBox();
        DatePicker datePicker = new DatePicker();
        TextField textField6 = new TextField();
        TextField textField7 = new TextField();
        TextField textField8 = new TextField();
        TextField textField9 = new TextField();
        TextField textField10 = new TextField();
        TextField textField11 = new TextField();
        Hr hr2 = new Hr();
        H3 h32 = new H3();
        FormLayout formLayout2Col3 = new FormLayout();
        DatePicker datePicker2 = new DatePicker();
        TextField textField12 = new TextField();
        ComboBox comboBox2 = new ComboBox();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        textLarge.setText("Bill To:");
        textLarge.setWidth("100%");
        textLarge.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        formLayout2Col.setWidth("100%");
        textField.setLabel("Patient ID");
        textField.setWidth("min-content");
        textField2.setLabel("Patient Name");
        textField2.setWidth("min-content");
        textField3.setLabel("Patient Address");
        textField3.setWidth("min-content");
        textField4.setLabel("Patient Phone Number");
        textField4.setWidth("min-content");
        textField5.setLabel("[Patient Email Address");
        textField5.setWidth("min-content");
        h3.setText("Description of Service");
        h3.setWidth("max-content");
        formLayout2Col2.setWidth("100%");
        comboBox.setLabel("Service Type");
        comboBox.setWidth("min-content");
        setComboBoxSampleData(comboBox);
        datePicker.setLabel("Date of Service");
        datePicker.setWidth("min-content");
        textField6.setLabel("Healthcare Provider");
        textField6.setWidth("min-content");
        textField7.setLabel("Decsription");
        textField7.setWidth("min-content");
        textField8.setLabel("Fee");
        textField8.setWidth("min-content");
        textField9.setLabel("Subtotal");
        textField9.setWidth("min-content");
        textField10.setLabel("Tax");
        textField10.setWidth("min-content");
        textField11.setLabel("Total Amount Due");
        textField11.setWidth("min-content");
        h32.setText("Payment Information");
        h32.setWidth("max-content");
        formLayout2Col3.setWidth("100%");
        datePicker2.setLabel("Payment Due Date");
        datePicker2.setWidth("min-content");
        textField12.setLabel("Payment Address");
        textField12.setWidth("min-content");
        comboBox2.setLabel("Payment Method");
        comboBox2.setWidth("min-content");
        setComboBoxSampleData(comboBox2);
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonPrimary.setText("Save");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancel");
        buttonSecondary.setWidth("min-content");
        getContent().add(textLarge);
        getContent().add(formLayout2Col);
        formLayout2Col.add(textField);
        formLayout2Col.add(textField2);
        formLayout2Col.add(textField3);
        formLayout2Col.add(textField4);
        formLayout2Col.add(textField5);
        getContent().add(h3);
        getContent().add(hr);
        getContent().add(formLayout2Col2);
        formLayout2Col2.add(comboBox);
        formLayout2Col2.add(datePicker);
        formLayout2Col2.add(textField6);
        formLayout2Col2.add(textField7);
        formLayout2Col2.add(textField8);
        formLayout2Col2.add(textField9);
        formLayout2Col2.add(textField10);
        formLayout2Col2.add(textField11);
        getContent().add(hr2);
        getContent().add(h32);
        getContent().add(formLayout2Col3);
        formLayout2Col3.add(datePicker2);
        formLayout2Col3.add(textField12);
        formLayout2Col3.add(comboBox2);
        getContent().add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonSecondary);
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setComboBoxSampleData(ComboBox comboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        comboBox.setItems(sampleItems);
        comboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }
}
