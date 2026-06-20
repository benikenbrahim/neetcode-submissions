class Solution {
    public boolean isAnagram(String s, String t) {
        // Étape 1 : Si les tailles sont différentes, ce ne sont pas des anagrammes
        if (s.length() != t.length()) {
            return false;
        }
        
        // Étape 2 : Convertir les chaînes en tableaux de caractères
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        
        // Étape 3 : Trier les deux tableaux par ordre alphabétique
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);
        
        // Étape 4 : Comparer si les deux tableaux triés sont identiques
        return Arrays.equals(charArrayS, charArrayT);
    }
}