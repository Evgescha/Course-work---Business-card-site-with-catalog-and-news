package com.cardSite.businessCardSite.service;

// основные операции с сущностью в бд
public interface CrudService<Entity> {

    void create(Entity entity) throws Exception;

    Entity read(long id);

    void update(Entity entity) throws Exception;

    void delete(long id) throws Exception;
}