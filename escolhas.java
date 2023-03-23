public class escolhas {
    private String text;
    private String textmos; 
    private capitulos pcap;
    escolhas(String text, capitulos pcap, String textmos) {
  
      this.text = text;
      this.textmos = textmos;
      this.pcap = pcap;
    }
 
    public String getTextovisivel()
    {
        return this.textmos;
    }
  
    public capitulos getProxc()
    {
        return this.pcap;
    }
  
    public String getTextdigitado()
    {
        return this.text;
    }
}
