package com.Sports.services;

import com.Sports.models.Field;
import com.Sports.repositories.*;

public class DatabaseService {
    private static DatabaseService service = null;
    private BorrowedItemRepository borrowedItemRepository;
    private CoachRepository coachRepository;
    private FieldRepository fieldRepository;
    private GameRepository gameRepository;
    private ItemRepository itemRepository;
    private SportRepository sportRepository;
    private StudentRepository studentRepository;
    private TeamRepository teamRepository;
    private LostItemRepository lostItemRepository;
    private SessionRepository sessionRepository;
    private GameRequestRepository gameRequestRepository;
    private  RequestItemsRepository requestItemsRepository;

    private DatabaseService(){
        gameRequestRepository = new GameRequestRepository();
        sessionRepository = new SessionRepository();
       borrowedItemRepository = new BorrowedItemRepository();
       coachRepository = new CoachRepository();
       fieldRepository = new FieldRepository();
       gameRepository = new GameRepository();
       itemRepository = new ItemRepository();
       sportRepository = new SportRepository();
       studentRepository = new StudentRepository();
       teamRepository = new TeamRepository();
       lostItemRepository = new LostItemRepository();
       requestItemsRepository = new RequestItemsRepository();
    }

    public LostItemRepository getLostItemRepository() {
        return lostItemRepository;
    }

    public RequestItemsRepository getRequestItemsRepository() {
        return requestItemsRepository;
    }

    public static DatabaseService getInstance(){
        if(service == null)service = new DatabaseService();
        return service;
    }


    public BorrowedItemRepository getBorrowedItemRepository() {
        return borrowedItemRepository;
    }

    public CoachRepository getCoachRepository() {
        return coachRepository;
    }

    public FieldRepository getFieldRepository() {
        return fieldRepository;
    }

    public GameRepository getGameRepository() {
        return gameRepository;
    }

    public ItemRepository getItemRepository() {
        return itemRepository;
    }

    public SportRepository getSportRepository() {
        return sportRepository;
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public TeamRepository getTeamRepository() {
        return teamRepository;
    }

    public GameRequestRepository getGameRequestRepository() {
        return gameRequestRepository;
    }

    public SessionRepository getSessionRepository() {
        return sessionRepository;
    }
}
