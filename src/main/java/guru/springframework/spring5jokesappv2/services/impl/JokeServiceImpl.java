package guru.springframework.spring5jokesappv2.services.impl;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
