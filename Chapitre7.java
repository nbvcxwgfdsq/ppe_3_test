
public class Chapitre7 {

		private String nom; 
		private float note;
		public Chapitre7(String unNom, float uneNote) throws NoteNegativeException{
			if(uneNote<0)
				throw new NoteNegativeException();
			else{
				this.nom=unNom;
				this.note=uneNote;
			}
		}
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		int a=20, b=0;
		try{
			System.out.println(a/b);
		}
		catch (Exception e){
			System.out.println("Division par zéro!");
		}
		System.out.println("Fin du programme"); // non exécuté
		
		try{
			System.out.println("=>"+(1/0));
		}
		catch (Exception e){
			System.out.println("Division par zéro!");
		}
		finally{
			System.out.println("action faite systématiquement");
		}
		
		try{
			Chapitre7 e=new Chapitre7("Clovis",-10);
		}
		catch (NoteNegativeException e){
			System.out.println("Pas de note <0 !");
		}
	}
	
	class NoteNegativeException extends Exception{
		public NoteNegativeException(){
			System.out.println("Vous instancier un élève avec une noté négative!");
		}
	}
	
}

