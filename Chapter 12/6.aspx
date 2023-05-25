using System;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;
using JSimpCalcWebServiceService;

public partial class _Default : System.Web.UI.Page 
{
    JSimpCalcWebServiceService.JSimpCalcWebServiceService proxy;

    protected void Page_Load(object sender, EventArgs e)
    {
        proxy = new JSimpCalcWebServiceService.JSimpCalcWebServiceService();
    }

    protected void btnAddition_Click(object sender, EventArgs e)
    {
        try
        {
            lblResultAddition.Text = "Result: " + proxy.addition(double.Parse(txtbtnAdditionParameter1.Text), 
								double.Parse(txtbtnAdditionParameter2.Text));
        }
        catch (FormatException)
        {
            lblResultAddition.Text = "Result: Invalide Input";
        }
        UpdatePanelAddition.Update();
    }

    protected void btnSubtraction_Click(object sender, EventArgs e)
    {
        try
        {
            lblResultSubtraction.Text = "Result: " + proxy.subtraction(double.Parse(txtSubtractionParameter1.Text), 
									double.Parse(txtSubtractionParameter2.Text));
        }
        catch(FormatException)
        {
            lblResultSubtraction.Text = "Result: Invalide Input";
        }

        UpdatePanelSubtraction.Update();
    }
    protected void btnMultiplication_Click(object sender, EventArgs e)
    {
        try
        {
            lblResultMultiplication.Text = "Result: " + proxy.multiplication(double.Parse(txtMultiplicationParameter1.Text), 
									double.Parse(txtMultiplicationParameter2.Text));
        }
        catch (FormatException)
        {
            lblResultMultiplication.Text = "Result: Invalide Input";
        }

        UpdatePanelMultiplication.Update();
    }

    protected void btnDivision_Click(object sender, EventArgs e)
    {
        try
        {
            lblResultDivision.Text = "Result: " + proxy.division(double.Parse(txtDivisionParameter1.Text), 
								double.Parse(txtDivisionParameter2.Text));
        }
        catch (FormatException)
        {
            lblResultDivision.Text = "Result: Invalide Input";
        }

        UpdatePanelDivision.Update();
    }

    protected void btnMaximum_Click(object sender, EventArgs e)
    {
        try
        {
            lblResultMaxMin.Text = "Result: " + proxy.maximum(double.Parse(txtMaxMinParameter1.Text), 
							double.Parse(txtMaxMinParameter2.Text));
        }
        catch (FormatException)
        {
            lblResultMaxMin.Text = "Result: Invalide Input";
        }

        UpdatePanelMaxMin.Update();
    }

    protected void btnMinimum_Click(object sender, EventArgs e)
    {
        try
        {
            lblResultMaxMin.Text = "Result: " + proxy.minimum(double.Parse(txtMaxMinParameter1.Text),
								double.Parse(txtMaxMinParameter2.Text));
        }
        catch (FormatException)
        {
            lblResultMaxMin.Text = "Result: Invalide Input";
        }

        UpdatePanelMaxMin.Update();
    }

    protected void btnPower_Click(object sender, EventArgs e)
    {
        try
        {
            lblResultPower.Text = "Result: " + proxy.power(double.Parse(txtPowerParameter1.Text), 
							double.Parse(txtPowerParameter2.Text));
        }
        catch (FormatException)
        {
            lblResultPower.Text = "Result: Invalide Input";
        }

        UpdatePanelPower.Update();
    } 
}