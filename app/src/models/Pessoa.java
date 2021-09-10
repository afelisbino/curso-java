package models;

public class Pessoa {
    private String documento;

    public void setDocumento(String documento) {
        if(validaDocumento(documento)){
            this.documento = documento;
        }
        else{
            System.out.println("Documento invalido!");
        }        
    }

    public String getDocumento() {
        return documento;
    }

    public boolean validaDocumento(String documento){
        return (documento.length() > 14) ? false : true;
    }

}
