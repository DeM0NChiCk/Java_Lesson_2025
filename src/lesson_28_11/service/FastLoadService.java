package lesson_28_11.service;

import lesson_28_11.model.Product;

public interface FastLoadService extends LoadService {

    void fastLoad(Product[] products);
}
