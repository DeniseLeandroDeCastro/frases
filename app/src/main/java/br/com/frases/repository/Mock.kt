package br.com.frases.repository

import br.com.frases.infra.MotivationConstants
import java.util.*


data class  Phrase(val description: String, val category: Int)

class Mock {

    private val ALL = MotivationConstants.PHRASEFILTER.ALL
    private val DAY = MotivationConstants.PHRASEFILTER.DAY //Morning
    private val NIGTH = MotivationConstants.PHRASEFILTER.NIGTH //Happy

    private val mListPhrases: List<Phrase> = listOf(
        Phrase("Não sabendo que era impossível, foi lá e fez.", DAY),
        Phrase("Você não é derrotado quando perde, você é derrotado quando desiste!", DAY),
        Phrase("Quando está mais escuro, vemos mais estrelas!", DAY),
        Phrase("Insanidade é fazer sempre a mesma coisa e esperar um resultado diferente.", DAY),
        Phrase("Não pare quando estiver cansado, pare quando tiver terminado.", DAY),
        Phrase("O que você pode fazer agora que tem o maior impacto sobre o seu sucesso?", DAY),
        Phrase("A melhor maneira de prever o futuro é inventá-lo.", NIGTH),
        Phrase("Você perde todas as chances que você não aproveita.", NIGTH),
        Phrase("Fracasso é o condimento que dá sabor ao sucesso.", NIGTH),
        Phrase(" Enquanto não estivermos comprometidos, haverá hesitação!", NIGTH),
        Phrase("Se você não sabe onde quer ir, qualquer caminho serve.", NIGTH),
        Phrase("Se você acredita, faz toda a diferença.", NIGTH),
        Phrase("Riscos devem ser corridos, porque o maior perigo é não arriscar nada!", NIGTH)
    )

    //Função que retorna a frase
    fun getPhrase(categoryId: Int): String {

        val filtered = mListPhrases.filter { (it.category == categoryId || categoryId == ALL) }
        val rand = Random().nextInt(filtered.size)

        return filtered[rand].description
    }
}